package com.muhmmadnabil.hesnalmoslem


import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_cardview.view.*


class myAdapter(private var myList:ArrayList<CardviewData>) :RecyclerView.Adapter<myAdapter.ViewHolder>() {

    var context:Context?=null
    private lateinit var view:View

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        view=LayoutInflater.from(parent.context).inflate(R.layout.item_cardview,parent,false)
        context=parent.context
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.count.text=myList[position].counter.toString()
        holder.cardtext.text=myList[position].text
        holder.cardtext.textSize = myList[position].textsize


        holder.itemView.setOnClickListener {
            myList[position].counter--
            if(myList[position].counter==0){
                myList.removeAt(position)
            }
            notifyDataSetChanged()
            if(myList.isEmpty()){
                val intent= Intent(context,MainActivity()::class.java)
                context?.startActivity(intent)
            }
        }
        holder.itemView.btn_share_text.setOnClickListener {
            val intent=Intent(Intent.ACTION_SEND)
            intent.setType("text/plain")
            val text=holder.itemView.tv_text.text
            intent.putExtra(Intent.EXTRA_SUBJECT,"تقدر تحمل التطبيق من خلال:https://play.google.com/store/apps/details?id=com.eslam.ahmed.dlilelmoslim")
            intent.putExtra(Intent.EXTRA_SUBJECT,text)
            context?.startActivity(Intent.createChooser(intent,"مشاركة من خلال"))

        }
    }

    fun textZoomIn(){
        for (i in myList){
            when(i.textsize){
                20f->i.textsize=25f
                25f->i.textsize=30f
                30f->i.textsize=35f
                35f->i.textsize=40f
                40f->i.textsize=45f
                45f->i.textsize=50f
                else->Toast.makeText(context,"لا يمكن التكبير أكثر",Toast.LENGTH_LONG).show()
            }
        }
        notifyDataSetChanged()
    }

    fun textZoomOut(){
        for (i in myList){
            when(i.textsize){
                15f->i.textsize=10f
                20f->i.textsize=15f
                25f->i.textsize=20f
                30f->i.textsize=25f
                35f->i.textsize=30f
                40f->i.textsize=35f
                45f->i.textsize=40f
                50f->i.textsize=45f
                else->Toast.makeText(context,"لا يمكن التصغير أكثر",Toast.LENGTH_LONG).show()
            }
        }
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return myList.size
    }


    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        val count=itemView.findViewById<TextView>(R.id.tv_counter)
        val cardtext=itemView.findViewById<TextView>(R.id.tv_text)

    }
}
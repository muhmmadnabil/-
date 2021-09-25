package com.muhmmadnabil.hesnalmoslem


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_azkar.view.*


class AzkarFragment : Fragment() {

    private val myList1=Data.getList1()
    private val myList2=Data.getList2()
    private val myList3=Data.getList3()
    private val myList4=Data.getList4()
    private val myList5=Data.getList5()
    private val myList6=Data.getList6()
    private val myList7=Data.getList7()
    private val myList8=Data.getList8()
    private val myList9=Data.getList9()
    private val myList10=Data.getList10()
    private val myDataList1=Data.getData1()
    private val myDataList2=Data.getData2()
    private val myDataList3=Data.getData3()
    private val myDataList4=Data.getData4()
    private val myDataList5=Data.getData5()
    private val myDataList6=Data.getData6()
    private val myDataList7=Data.getData7()
    private val myDataList8=Data.getData8()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_azkar, container, false)

        val sentData=this.arguments?.get("index")
        view.recycler_view.layoutManager=LinearLayoutManager(context)


        when(sentData){
            1.1f->{
                val adapter=myAdapter(myList1)
                view.recycler_view.adapter=adapter
                (activity as MainActivity).bot_nav.visibility=View.GONE
                view.btn_zoom_in.setOnClickListener {
                    adapter.textZoomIn()
                }
                view.btn_zoom_out.setOnClickListener {
                    adapter.textZoomOut()
                }
            }
            1.2f->{
                val adapter=myAdapter(myList2)
                view.recycler_view.adapter=adapter
                (activity as MainActivity).bot_nav.visibility=View.GONE
                view.btn_zoom_in.setOnClickListener {
                    adapter.textZoomIn()
                }
                view.btn_zoom_out.setOnClickListener {
                    adapter.textZoomOut()
                }
            }
            1.3f->{
                val adapter=myAdapter(myList3)
                view.recycler_view.adapter=adapter
                (activity as MainActivity).bot_nav.visibility=View.GONE
                view.btn_zoom_in.setOnClickListener {
                    adapter.textZoomIn()
                }
                view.btn_zoom_out.setOnClickListener {
                    adapter.textZoomOut()
                }
            }
            1.4f->{
                val adapter=myAdapter(myList4)
                view.recycler_view.adapter=adapter
                (activity as MainActivity).bot_nav.visibility=View.GONE
                view.btn_zoom_in.setOnClickListener {
                    adapter.textZoomIn()
                }
                view.btn_zoom_out.setOnClickListener {
                    adapter.textZoomOut()
                }
            }
            1.5f->{
                val adapter=myAdapter(myList5)
                view.recycler_view.adapter=adapter
                (activity as MainActivity).bot_nav.visibility=View.GONE
                view.btn_zoom_in.setOnClickListener {
                    adapter.textZoomIn()
                }
                view.btn_zoom_out.setOnClickListener {
                    adapter.textZoomOut()
                }
            }
            1.6f->{
                val adapter=myAdapter(myList6)
                view.recycler_view.adapter=adapter
                (activity as MainActivity).bot_nav.visibility=View.GONE
                view.btn_zoom_in.setOnClickListener {
                    adapter.textZoomIn()
                }
                view.btn_zoom_out.setOnClickListener {
                    adapter.textZoomOut()
                }
            }
            1.7f->{
                val adapter=myAdapter(myList7)
                view.recycler_view.adapter=adapter
                (activity as MainActivity).bot_nav.visibility=View.GONE
                view.btn_zoom_in.setOnClickListener {
                    adapter.textZoomIn()
                }
                view.btn_zoom_out.setOnClickListener {
                    adapter.textZoomOut()
                }
            }
            1.8f->{
                val adapter=myAdapter(myList8)
                view.recycler_view.adapter=adapter
                (activity as MainActivity).bot_nav.visibility=View.GONE
                view.btn_zoom_in.setOnClickListener {
                    adapter.textZoomIn()
                }
                view.btn_zoom_out.setOnClickListener {
                    adapter.textZoomOut()
                }
            }
            1.9f->{
                val adapter=myAdapter(myList9)
                view.recycler_view.adapter=adapter
                (activity as MainActivity).bot_nav.visibility=View.GONE
                view.btn_zoom_in.setOnClickListener {
                    adapter.textZoomIn()
                }
                view.btn_zoom_out.setOnClickListener {
                    adapter.textZoomOut()
                }
            }
            1.11f->{
                val adapter=myAdapter(myList10)
                view.recycler_view.adapter=adapter
                (activity as MainActivity).bot_nav.visibility=View.GONE
                view.btn_zoom_in.setOnClickListener {
                    adapter.textZoomIn()
                }
                view.btn_zoom_out.setOnClickListener {
                    adapter.textZoomOut()
                }
            }
            2.1f->{
                val adapter=myAdapter(myDataList1)
                view.recycler_view.adapter=adapter
                (activity as MainActivity).bot_nav.visibility=View.GONE
                view.btn_zoom_in.setOnClickListener {
                    adapter.textZoomIn()
                }
                view.btn_zoom_out.setOnClickListener {
                    adapter.textZoomOut()
                }
            }
            2.2f->{
                val adapter=myAdapter(myDataList2)
                view.recycler_view.adapter=adapter
                (activity as MainActivity).bot_nav.visibility=View.GONE
                view.btn_zoom_in.setOnClickListener {
                    adapter.textZoomIn()
                }
                view.btn_zoom_out.setOnClickListener {
                    adapter.textZoomOut()
                }
            }
            2.3f->{
                val adapter=myAdapter(myDataList3)
                view.recycler_view.adapter=adapter
                (activity as MainActivity).bot_nav.visibility=View.GONE
                view.btn_zoom_in.setOnClickListener {
                    adapter.textZoomIn()
                }
                view.btn_zoom_out.setOnClickListener {
                    adapter.textZoomOut()
                }
            }
            2.4f->{
                val adapter=myAdapter(myDataList4)
                view.recycler_view.adapter=adapter
                (activity as MainActivity).bot_nav.visibility=View.GONE
                view.btn_zoom_in.setOnClickListener {
                    adapter.textZoomIn()
                }
                view.btn_zoom_out.setOnClickListener {
                    adapter.textZoomOut()
                }
            }
            2.5f->{
                val adapter=myAdapter(myDataList5)
                view.recycler_view.adapter=adapter
                (activity as MainActivity).bot_nav.visibility=View.GONE
                view.btn_zoom_in.setOnClickListener {
                    adapter.textZoomIn()
                }
                view.btn_zoom_out.setOnClickListener {
                    adapter.textZoomOut()
                }
            }
            2.6f->{
                val adapter=myAdapter(myDataList6)
                view.recycler_view.adapter=adapter
                (activity as MainActivity).bot_nav.visibility=View.GONE
                view.btn_zoom_in.setOnClickListener {
                    adapter.textZoomIn()
                }
                view.btn_zoom_out.setOnClickListener {
                    adapter.textZoomOut()
                }
            }
            2.7f->{
                val adapter=myAdapter(myDataList7)
                view.recycler_view.adapter=adapter
                (activity as MainActivity).bot_nav.visibility=View.GONE
                view.btn_zoom_in.setOnClickListener {
                    adapter.textZoomIn()
                }
                view.btn_zoom_out.setOnClickListener {
                    adapter.textZoomOut()
                }
            }
            2.8f->{
                val adapter=myAdapter(myDataList8)
                view.recycler_view.adapter=adapter
                (activity as MainActivity).bot_nav.visibility=View.GONE
                view.btn_zoom_in.setOnClickListener {
                    adapter.textZoomIn()
                }
                view.btn_zoom_out.setOnClickListener {
                    adapter.textZoomOut()
                }
            }
        }


        view.btn_back.setOnClickListener {
            (activity as MainActivity).changeFragment(HomeFragment())
            (activity as MainActivity).bot_nav.visibility=View.VISIBLE
        }

        return view
    }
}
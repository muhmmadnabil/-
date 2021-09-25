package com.muhmmadnabil.hesnalmoslem

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_third.view.*


class ThirdFragment : Fragment() {

    private var counter: Int = 0
    private var bigCounter: Int = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_third, container, false)



        view.third_btn1.setOnClickListener {
            counter++
            view.third_tv_counter.text = counter.toString()
            if (counter > bigCounter) {
                bigCounter = counter
            }
        }

        writeData()

        view.btn_reset.setOnClickListener {
            counter = 0
            view.third_tv_counter.text = counter.toString()
        }
        view.tv_big_count.text = bigCounter.toString()

        view.tv_big_count.text=readData().toString()

            return view

        }
    private fun writeData(){
        val c=readData()
        if(bigCounter> c!!){
            val sharedPref = activity?.getPreferences(Context.MODE_PRIVATE) ?: return
            with (sharedPref.edit()) {
                putInt(getString(R.string.data_key), bigCounter)
                apply()
            }
        }

    }
    private fun readData(): Int? {
        val sharedPref = activity?.getPreferences(Context.MODE_PRIVATE)
        val defaultValue = 0
        return sharedPref?.getInt(getString(R.string.data_key), defaultValue)

    }

    override fun onDestroy() {
        counter=0
        super.onDestroy()
    }

}
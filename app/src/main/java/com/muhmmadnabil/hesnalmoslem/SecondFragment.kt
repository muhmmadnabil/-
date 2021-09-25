package com.muhmmadnabil.hesnalmoslem

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_second.view.*

class SecondFragment : Fragment() {

    private val fragment=AzkarFragment()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_second, container, false)

        view.second_btn1.setOnClickListener {
            val bundle=Bundle()
            bundle.putFloat("index",2.1f)
            fragment.arguments=bundle
            fragmentManager?.beginTransaction()?.replace(R.id.fl_main,fragment)?.commit()

        }
        view.second_btn2.setOnClickListener {
            val bundle=Bundle()
            bundle.putFloat("index",2.2f)
            fragment.arguments=bundle
            fragmentManager?.beginTransaction()?.replace(R.id.fl_main,fragment)?.commit()
        }
        view.second_btn3.setOnClickListener {
            val bundle=Bundle()
            bundle.putFloat("index",2.3f)
            fragment.arguments=bundle
            fragmentManager?.beginTransaction()?.replace(R.id.fl_main,fragment)?.commit()
        }
        view.second_btn4.setOnClickListener {
            val bundle=Bundle()
            bundle.putFloat("index",2.4f)
            fragment.arguments=bundle
            fragmentManager?.beginTransaction()?.replace(R.id.fl_main,fragment)?.commit()
        }
        view.second_btn5.setOnClickListener {
            val bundle=Bundle()
            bundle.putFloat("index",2.5f)
            fragment.arguments=bundle
            fragmentManager?.beginTransaction()?.replace(R.id.fl_main,fragment)?.commit()
        }
        view.second_btn6.setOnClickListener {
            val bundle=Bundle()
            bundle.putFloat("index",2.6f)
            fragment.arguments=bundle
            fragmentManager?.beginTransaction()?.replace(R.id.fl_main,fragment)?.commit()
        }
        view.second_btn7.setOnClickListener {
            val bundle=Bundle()
            bundle.putFloat("index",2.7f)
            fragment.arguments=bundle
            fragmentManager?.beginTransaction()?.replace(R.id.fl_main,fragment)?.commit()
        }
        view.second_btn8.setOnClickListener {
            val bundle=Bundle()
            bundle.putFloat("index",2.8f)
            fragment.arguments=bundle
            fragmentManager?.beginTransaction()?.replace(R.id.fl_main,fragment)?.commit()
        }

        return view
    }

}
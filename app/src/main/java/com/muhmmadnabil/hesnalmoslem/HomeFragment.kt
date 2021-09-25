package com.muhmmadnabil.hesnalmoslem

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : Fragment() {

    private val fragment=AzkarFragment()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        view.btn1.setOnClickListener {
            val bundle = Bundle()
            bundle.putFloat("index",1.1f)
            fragment.arguments = bundle
            fragmentManager?.beginTransaction()?.replace(R.id.fl_main, fragment)?.commit()

        }
        view.btn2.setOnClickListener {
            val bundle = Bundle()
            bundle.putFloat("index", 1.2f)
            fragment.arguments = bundle
            this.fragmentManager?.beginTransaction()?.replace(R.id.fl_main, fragment)?.commit()
        }
        view.btn3.setOnClickListener {
            val bundle = Bundle()
            bundle.putFloat("index", 1.3f)
            fragment.arguments = bundle
            fragmentManager?.beginTransaction()?.replace(R.id.fl_main, fragment)?.commit()
        }
        view.btn4.setOnClickListener {
            val bundle = Bundle()
            bundle.putFloat("index", 1.4f)
            fragment.arguments = bundle
            fragmentManager?.beginTransaction()?.replace(R.id.fl_main, fragment)?.commit()
        }
        view.btn5.setOnClickListener {
            val bundle = Bundle()
            bundle.putFloat("index", 1.5f)
            fragment.arguments = bundle
            fragmentManager?.beginTransaction()?.replace(R.id.fl_main, fragment)?.commit()
        }
        view.btn6.setOnClickListener {
            val bundle = Bundle()
            bundle.putFloat("index", 1.6f)
            fragment.arguments = bundle
            fragmentManager?.beginTransaction()?.replace(R.id.fl_main, fragment)?.commit()
        }
        view.btn7.setOnClickListener {
            val bundle = Bundle()
            bundle.putFloat("index", 1.7f)
            fragment.arguments = bundle
            fragmentManager?.beginTransaction()?.replace(R.id.fl_main, fragment)?.commit()
        }
        view.btn8.setOnClickListener {
            val bundle = Bundle()
            bundle.putFloat("index", 1.8f)
            fragment.arguments = bundle
            fragmentManager?.beginTransaction()?.replace(R.id.fl_main, fragment)?.commit()
        }
        view.btn9.setOnClickListener {
            val bundle = Bundle()
            bundle.putFloat("index", 1.9f)
            fragment.arguments = bundle
            fragmentManager?.beginTransaction()?.replace(R.id.fl_main, fragment)?.commit()
        }
        view.btn10.setOnClickListener {
            val bundle = Bundle()
            bundle.putFloat("index", 1.11f)
            fragment.arguments = bundle
            fragmentManager?.beginTransaction()?.replace(R.id.fl_main, fragment)?.commit()
        }

        return view
    }
}
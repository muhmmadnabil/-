package com.muhmmadnabil.hesnalmoslem

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_fourth.view.*


class FourthFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_fourth, container, false)

        view.btn_share.setOnClickListener {
            val intent= Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_TEXT,"https://play.google.com/store/apps/details?id=com.eslam.ahmed.dlilelmoslim")
            startActivity(Intent.createChooser(intent,"مشاركة عبر"))
        }


        return view
    }
}
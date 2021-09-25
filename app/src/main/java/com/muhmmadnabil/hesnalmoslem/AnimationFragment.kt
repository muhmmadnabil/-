package com.muhmmadnabil.hesnalmoslem

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_animation.view.*


class AnimationFragment : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_animation, container, false)

        (activity as MainActivity).bot_nav.visibility=View.GONE

        val animation= AnimationUtils.loadAnimation(context,R.anim.blink)
        view.iv_image.startAnimation(animation)

        Handler().postDelayed({
            (activity as MainActivity).bot_nav.visibility=View.VISIBLE
            (activity as MainActivity).changeFragment(HomeFragment())
        },6000)


        return view
    }
}
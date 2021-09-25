package com.muhmmadnabil.hesnalmoslem


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

var isFirstTime=true
class MainActivity : AppCompatActivity() {

    private val animationFragment=AnimationFragment()
    private val homeFragment=HomeFragment()
    private val secondFragment=SecondFragment()
    private val thirdFragment=ThirdFragment()
    private val fourthFragment=FourthFragment()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(isFirstTime){
            changeFragment(animationFragment)
            isFirstTime=false
        }else{
            changeFragment(homeFragment)
            bot_nav.visibility=View.VISIBLE
        }





        bot_nav.setOnItemSelectedListener {
            when(it.itemId){
               R.id.azkar->changeFragment(homeFragment)
               R.id.adea->changeFragment(secondFragment)
               R.id.tasbea->changeFragment(thirdFragment)
               R.id.share->changeFragment(fourthFragment)
            }
            true
        }
    }

    fun changeFragment(fragment:Fragment){
        val transaction=supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fl_main,fragment)
        transaction.commit()
    }



    private var counterExit=0
    override fun onBackPressed() {
        counterExit++
        if(counterExit>=2)
        {
            super.onBackPressed()
        }else{
            changeFragment(homeFragment)
            bot_nav.visibility=View.VISIBLE
            Toast.makeText(this,"أضغط مرة أخرى للخروج",Toast.LENGTH_LONG).show()
        }

    }
}
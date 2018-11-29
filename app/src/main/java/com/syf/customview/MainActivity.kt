package com.syf.customview

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pieView.setStartAngle(50F)
        val list = ArrayList<PieData>(10)

        var i = 0
        while (i < 10) {
            i++
            list.add(PieData(""+i,50F,50F, Color.BLACK,50f))
        }
        pieView.setData(list)
    }
}

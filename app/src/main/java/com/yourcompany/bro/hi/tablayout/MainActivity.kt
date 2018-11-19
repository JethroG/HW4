package com.yourcompany.bro.hi.tablayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.yourcompany.bro.hi.tablayout.adapters.Adapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentAdapter = Adapter(supportFragmentManager)
        viewpager_main.adapter = fragmentAdapter
        tabs_main.setupWithViewPager(viewpager_main)

    }
}
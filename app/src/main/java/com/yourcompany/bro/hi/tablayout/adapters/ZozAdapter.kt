package com.yourcompany.bro.hi.tablayout.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.yourcompany.bro.hi.tablayout.R
import com.yourcompany.bro.hi.tablayout.Zoz
import kotlinx.android.synthetic.main.zodiac.view.*

class ZozAdapter(context: Context, foodsList: ArrayList<Zoz>) : BaseAdapter() {
    var zodicList = foodsList
    var context: Context? = context

    override fun getCount(): Int {
        return zodicList.size
    }

    override fun getItem(position: Int): Any {
        return zodicList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    @SuppressLint("ViewHolder", "InflateParams")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val zodic = this.zodicList[position]

        val inflator = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val zodiacView = inflator.inflate(R.layout.zodiac, null)
        zodiacView.imgZodiac.setImageResource(zodic.image!!)
        zodiacView.name.text = zodic.name!!

        return zodiacView
    }
}
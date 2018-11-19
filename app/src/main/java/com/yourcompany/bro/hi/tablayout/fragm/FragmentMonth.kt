package com.yourcompany.bro.hi.tablayout.fragm

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import com.yourcompany.bro.hi.tablayout.R


class FragmentMonth: Fragment(){


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater!!.inflate(R.layout.fragment_month, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var array = arrayOf("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December")

        val adapter = ArrayAdapter(context,
            R.layout.listview_item, array)

        val listView: ListView = view.findViewById(R.id.list_view_month)
        listView.adapter = adapter
    }


}
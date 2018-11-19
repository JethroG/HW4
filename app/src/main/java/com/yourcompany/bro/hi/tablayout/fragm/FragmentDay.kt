package com.yourcompany.bro.hi.tablayout.fragm


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import com.yourcompany.bro.hi.tablayout.R
import kotlinx.android.synthetic.main.fragment_day.*


class FragmentDay : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
     return   LayoutInflater.from(container?.context).inflate(R.layout.fragment_day, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var array = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

        val adapter = ArrayAdapter(context,
            R.layout.listview_item, array)

        val listView: ListView = view.findViewById(R.id.list_view)
        listView.adapter = adapter
    }


}


package com.yourcompany.bro.hi.tablayout.fragm

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yourcompany.bro.hi.tablayout.R
import com.yourcompany.bro.hi.tablayout.Zoz
import com.yourcompany.bro.hi.tablayout.adapters.ZozAdapter
import kotlinx.android.synthetic.main.fragment_zodiak.*

class FragmentZodiak: Fragment(){

    private var adapter: ZozAdapter? = null
    private var zozList = ArrayList<Zoz>()


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_zodiak, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        zozList.add(Zoz("Aries", R.drawable.aries))
        zozList.add(Zoz("Taurus", R.drawable.taurus))
        zozList.add(Zoz("Gemini", R.drawable.gemini))
        zozList.add(Zoz("Cancer",R.drawable.cancer))
        zozList.add(Zoz("Leo", R.drawable.leo))
        zozList.add(Zoz("Virgo", R.drawable.virgo))
        zozList.add(Zoz("Libra", R.drawable.libra))
        zozList.add(Zoz("Scorpio", R.drawable.scorpio))
        zozList.add(Zoz("Sagittarius", R.drawable.sagittarius))
        zozList.add(Zoz("Capricorn",R.drawable.capricorn))
        zozList.add(Zoz("Aquarius", R.drawable.aquarius))
        zozList.add(Zoz("Pisces", R.drawable.pisces))
        adapter = ZozAdapter(this.context!!, zozList)

        gvZodic.adapter = adapter
    }


}
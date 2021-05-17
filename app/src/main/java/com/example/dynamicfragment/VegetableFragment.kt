package com.example.dynamicfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.fragment_fruit.view.*
import kotlinx.android.synthetic.main.fragment_vegetable.view.*


class VegetableFragment : Fragment() {
    val Vegetables= arrayOf("Onion","Carrot","Cabbage","Potato","Tomato","kiwi","Pomengrante","Watermelon","Cherry")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val fragmentView=inflater.inflate(R.layout.fragment_vegetable,container,false)
        fragmentView.lvVegetables.adapter= ArrayAdapter<String>(
            context!!,
            android.R.layout.simple_list_item_1,
            android.R.id.text1,
            Vegetables
        )
        return fragmentView
    }


            }


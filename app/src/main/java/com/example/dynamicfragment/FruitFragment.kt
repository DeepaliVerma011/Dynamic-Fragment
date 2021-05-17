package com.example.dynamicfragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.fragment_fruit.view.*


class FruitFragment : Fragment() {

    val fruits= arrayOf("Apple","Orange","Banana","Pineapple","Grapes","kiwi","Pomengrante","Watermelon","Cherry")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val fragmentView=inflater.inflate(R.layout.fragment_fruit,container,false)
        fragmentView.lvFruits.adapter=ArrayAdapter<String>(
            context!!,
            android.R.layout.simple_list_item_1,
               android.R.id.text1,
                  fruits
        )
        return fragmentView
    }


    }

package com.originalstocks.jetpacknaviagtiondemo.Fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.originalstocks.jetpacknaviagtiondemo.R

/**
 * A simple [Fragment] subclass.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }


}

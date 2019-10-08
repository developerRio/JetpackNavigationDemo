package com.originalstocks.jetpacknaviagtiondemo.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import androidx.transition.TransitionInflater
import com.originalstocks.jetpacknaviagtiondemo.R

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        // soon transitions will be added in next commit
        sharedElementEnterTransition = TransitionInflater.from(context).inflateTransition(android.R.transition.move)

        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // that's how to navigate to fragment

        view.findViewById<Button>(R.id.button_one)?.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_firstFragment)
        }

        view.findViewById<Button>(R.id.button_two)?.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_secondFragment)
        }

    }

}

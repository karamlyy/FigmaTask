package com.emilabdurahmanli.zireddinapplication.core.bottom_navigation_fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.ViewGroup
import com.emilabdurahmanli.zireddinapplication.R
import com.emilabdurahmanli.zireddinapplication.databinding.FragmentHoroscopeBinding
import com.emilabdurahmanli.zireddinapplication.databinding.ToolBarBinding


class HoroscopeFragment : Fragment() {

    private lateinit var binding: FragmentHoroscopeBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.toolbar.backTv.visibilty = GONE
        binding.toolbar.
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHoroscopeBinding.inflate(layoutInflater, container, false)


        return inflater.inflate(binding.root, container, false)
    }


}
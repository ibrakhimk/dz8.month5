package com.example.dz8month5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.dz8month5.databinding.FragmentOnBoardingBinding
import me.relex.circleindicator.CircleIndicator3

class OnBoardFragment : Fragment() {

    private lateinit var binding: FragmentOnBoardingBinding
    private lateinit var adapter: OnBoardAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnBoardingBinding.inflate(inflater, container, false)
//        pref = Pref(requireContext())
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = OnBoardAdapter(this::onStartClick)
        binding.viewPager.adapter = adapter
        setIndicator()
//        if (pref.isUserSeen()){
//            findNavController().navigate(R.id.calculatorFragment)
//        }
    }

    private fun setIndicator() {
        val indicator: CircleIndicator3 = binding.indicator
        val viewPager = binding.viewPager
        indicator.setViewPager(viewPager)
    }

    private fun onStartClick() {
//        pref.saveUserSeen()
        findNavController().navigate(R.id.onBoardingFragment)
    }
}


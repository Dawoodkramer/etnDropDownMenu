package com.example.dropdownmenu.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.dropdownmenu.R
import com.example.dropdownmenu.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root


        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val sixMonthButton: Button = view.findViewById(R.id.sixMonthBtn)
        sixMonthButton.setOnClickListener {
            findNavController().navigate(R.id.nav_courses)
        }

        val sixWeekButton: Button = view.findViewById(R.id.sixWeekBtn)
        sixMonthButton.setOnClickListener {
            findNavController().navigate(R.id.nav_courses)
        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
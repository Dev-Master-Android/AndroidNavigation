package com.example.androidnavigation


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.androidnavigation.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonRed.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_redFragment)
        }

        binding.buttonYellow.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_yellowFragment)
        }

        binding.buttonGreen.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_greenFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

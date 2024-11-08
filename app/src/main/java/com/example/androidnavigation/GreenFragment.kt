package com.example.androidnavigation


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.androidnavigation.databinding.FragmentGreenBinding

class GreenFragment : Fragment() {
    private var _binding: FragmentGreenBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGreenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.greenMessage.text = "Движение разрешено!"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
package com.example.homework

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.homework.databinding.FragmentInputBinding

class InputFragment : Fragment() {

    private var _binding: FragmentInputBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentInputBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSend.setOnClickListener {
            val inputText = binding.editTextInput.text.toString()
            // Здесь вы можете обработать текст, например, передать его в другой фрагмент
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
package com.example.homework

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.homework.databinding.FragmentCountryDetailBinding

class CountryDetailFragment : Fragment() {

    private var _binding: FragmentCountryDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCountryDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val args = CountryDetailFragmentArgs.fromBundle(requireArguments())
        val countryId = args.countryId
        val country = CountryRepository.findById(countryId)

        country?.let {
            binding.countryNameTextView.text = it.name
            binding.shortDescriptionTextView.text = it.shortDescription
            binding.detailedDescriptionTextView.text = it.detailedDescription

            Glide.with(this)
                .load(it.flagUrl)
                .into(binding.flagImageView)
        }

        binding.backButtonImageView.setOnClickListener {
            findNavController().navigateUp()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
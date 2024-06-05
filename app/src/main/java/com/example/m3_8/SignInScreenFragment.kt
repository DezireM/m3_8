package com.example.m3_8

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.m3_8.databinding.FragmentSignInScreenBinding


class SignInScreenFragment : Fragment() {
    private lateinit var binding: FragmentSignInScreenBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSignInScreenBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val deadOrAlive = arguments?.getString("deadOrAlive")
        val name = arguments?.getString("name")
        val photo = arguments?.getString("photo")

        binding.tvDeadOrAlive.text = deadOrAlive
        binding.tvName.text = name
        Glide.with(binding.imgCharacter).load(photo).into(binding.imgCharacter)

    }
}
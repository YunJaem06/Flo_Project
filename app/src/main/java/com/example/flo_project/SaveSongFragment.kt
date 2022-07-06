package com.example.flo_project

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.flo_project.databinding.FragmentLockerSavesongBinding

class SaveSongFragment : Fragment() {

    lateinit var binding: FragmentLockerSavesongBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLockerSavesongBinding.inflate(inflater, container, false)

        return binding.root
    }
}
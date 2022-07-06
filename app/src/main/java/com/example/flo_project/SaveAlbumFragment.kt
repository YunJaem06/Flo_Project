package com.example.flo_project

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.flo_project.databinding.FragmentLockerSavealbumBinding
import com.example.flo_project.databinding.FragmentLockerSavesongBinding

class SaveAlbumFragment : Fragment() {

    lateinit var binding: FragmentLockerSavealbumBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLockerSavealbumBinding.inflate(inflater, container, false)

        return binding.root
    }
}
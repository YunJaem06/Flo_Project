package com.example.flo_project

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.flo_project.databinding.FragmentAlbumBinding
import com.google.android.material.tabs.TabLayoutMediator

class AlbumFragment : Fragment() {

    lateinit var binding: FragmentAlbumBinding
    
    private val information = arrayListOf("수록곡","상세정보", "영상")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAlbumBinding.inflate(inflater, container, false)

        binding.ivAlbumBack.setOnClickListener {
            (context as MainActivity).supportFragmentManager.beginTransaction()
                .replace(R.id.container_main, HomeFragment())
                .commitAllowingStateLoss()
        }
        binding.ivAlbumLikeOff.setOnClickListener {
            setLikeStatus(false)
        }
        binding.ivAlbumLikeOn.setOnClickListener {
            setLikeStatus(true)
        }

        val albumAdapter = AlbumVpAdapter(this)
        binding.vpAlbumContent.adapter = albumAdapter
        TabLayoutMediator(binding.tlAlbumContent, binding.vpAlbumContent){
            tab, position ->
            tab.text = information[position]
        }.attach()

        return binding.root
    }
    private fun setLikeStatus(isPlaying: Boolean){
        if (isPlaying) {
            binding.ivAlbumLikeOff.visibility = View.VISIBLE
            binding.ivAlbumLikeOn.visibility = View.GONE
        } else {
            binding.ivAlbumLikeOff.visibility = View.GONE
            binding.ivAlbumLikeOn.visibility = View.VISIBLE
        }
     }
}
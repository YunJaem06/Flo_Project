package com.example.flo_project

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.flo_project.databinding.FragmentAlbumBinding

class AlbumFragment : Fragment() {

    lateinit var binding : FragmentAlbumBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAlbumBinding.inflate(inflater,container,false)

        binding.ivAlbumBack.setOnClickListener {
            (context as MainActivity).supportFragmentManager.beginTransaction()
                .replace(R.id.container_main, HomeFragment())
                .commitAllowingStateLoss()
        }
        binding.ivAlbumSongMixoff.setOnClickListener {
            setAlbumMixStatus(false)
        }
        binding.ivAlbumSongMixon.setOnClickListener {
            setAlbumMixStatus(true)
        }

        binding.clAlbumSongGoback.setOnClickListener {
            Toast.makeText(activity,"장범준 - 고백", Toast.LENGTH_SHORT).show()
        }
        binding.clAlbumSongGoback2.setOnClickListener {
            Toast.makeText(activity,"10cm - 고백", Toast.LENGTH_SHORT).show()
        }
        binding.clAlbumSongGoback3.setOnClickListener {
            Toast.makeText(activity,"멜로망스 - 고백", Toast.LENGTH_SHORT).show()
        }
        binding.clAlbumSongGoback4.setOnClickListener {
            Toast.makeText(activity,"어반자카파 - 고백", Toast.LENGTH_SHORT).show()
        }
        binding.clAlbumSongGoback5.setOnClickListener {
            Toast.makeText(activity,"신용재 - 고백", Toast.LENGTH_SHORT).show()
        }

        return binding.root
    }
    fun setAlbumMixStatus(isPlaying : Boolean){
        if (isPlaying){
            binding.ivAlbumSongMixoff.visibility = View.VISIBLE
            binding.ivAlbumSongMixon.visibility = View.GONE
        } else {
            binding.ivAlbumSongMixoff.visibility = View.GONE
            binding.ivAlbumSongMixon.visibility = View.VISIBLE
        }
    }
}
package com.example.flo_project

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.flo_project.databinding.FragmentSongBinding

class SongFragment : Fragment() {

    lateinit var binding : FragmentSongBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSongBinding.inflate(inflater, container, false)

        binding.clAlbumSongGoback.setOnClickListener {
            Toast.makeText(activity, "장범준 - 고백", Toast.LENGTH_SHORT).show()
        }
        binding.clAlbumSongGoback2.setOnClickListener {
            Toast.makeText(activity, "10cm - 고백", Toast.LENGTH_SHORT).show()
        }
        binding.clAlbumSongGoback3.setOnClickListener {
            Toast.makeText(activity, "멜로망스 - 고백", Toast.LENGTH_SHORT).show()
        }
        binding.clAlbumSongGoback4.setOnClickListener {
            Toast.makeText(activity, "어반자카파 - 고백", Toast.LENGTH_SHORT).show()
        }
        binding.clAlbumSongGoback5.setOnClickListener {
            Toast.makeText(activity, "신용재 - 고백", Toast.LENGTH_SHORT).show()
        }
        binding.ivAlbumSongMixoff.setOnClickListener {
            setAlbumMixStatus(false)
        }
        binding.ivAlbumSongMixon.setOnClickListener {
            setAlbumMixStatus(true)
        }

        return binding.root
    }

    private fun setAlbumMixStatus(isPlaying: Boolean) {
        if (isPlaying) {
            binding.ivAlbumSongMixoff.visibility = View.VISIBLE
            binding.ivAlbumSongMixon.visibility = View.GONE
        } else {
            binding.ivAlbumSongMixoff.visibility = View.GONE
            binding.ivAlbumSongMixon.visibility = View.VISIBLE
        }
    }
}

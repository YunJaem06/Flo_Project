package com.example.flo_project

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.flo_project.databinding.ActivitySongBinding

class SongActivity : AppCompatActivity() {

    lateinit var binding : ActivitySongBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySongBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ibSongDown.setOnClickListener {
            finish()
        }
        binding.ivSongMiniplayer.setOnClickListener {
            setPlayerStatus(false)
        }
        binding.ivSongPause.setOnClickListener {
            setPlayerStatus(true)
        }
        if (intent.hasExtra("title") && intent.hasExtra("singer")){
            binding.tvSongMusicTitle.text=intent.getStringExtra("title")
            binding.tvSongMusicSinger.text=intent.getStringExtra("singer")
        }
    }

    fun setPlayerStatus(isPlaying : Boolean){
        if (isPlaying){
            binding.ivSongMiniplayer.visibility = View.VISIBLE
            binding.ivSongPause.visibility = View.GONE
        } else {
            binding.ivSongMiniplayer.visibility = View.GONE
            binding.ivSongPause.visibility = View.VISIBLE
        }
    }
}
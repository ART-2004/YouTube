package com.example.youtube.ui.video

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.youtube.R
import com.example.youtube.core.ui.BaseActivity
import com.example.youtube.core.ui.BaseViewModel
import com.example.youtube.databinding.ActivityVideoListsBinding
import com.example.youtube.ui.playlist.PlaylistActivity

class VideoListsActivity(override val viewModel: BaseViewModel) : BaseActivity<ActivityVideoListsBinding, BaseViewModel>() {
    override fun inflateViewBinding(): ActivityVideoListsBinding {
        return ActivityVideoListsBinding.inflate(layoutInflater)
    }

    override fun initListener() {
        super.initListener()
        val result = intent.getStringExtra(PlaylistActivity.ID)
        Toast.makeText(this, result, Toast.LENGTH_SHORT).show()
    }
}
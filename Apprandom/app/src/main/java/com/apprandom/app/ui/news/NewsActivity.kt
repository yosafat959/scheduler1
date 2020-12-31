package com.apprandom.app.ui.news

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil.setContentView
import com.apprandom.app.R

class NewsActivity : AppCompatActivity() {
    companion object {
        const val OPEN_NEWS = "open_news"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)
    }
}
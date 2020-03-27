package com.example.activityanimationsample

import android.content.Intent

class MainActivity : BaseActivity() {

    override val layoutId = R.layout.activity_main
    override val destinationIntent by lazy { Intent(this, SecondaryActivity::class.java) }
}
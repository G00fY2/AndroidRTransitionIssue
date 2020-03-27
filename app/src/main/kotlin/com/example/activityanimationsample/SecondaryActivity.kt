package com.example.activityanimationsample

import android.content.Intent

class SecondaryActivity : BaseActivity() {

    override val layoutId = R.layout.activity_secondary
    override val destinationIntent by lazy { Intent(this, MainActivity::class.java) }
}
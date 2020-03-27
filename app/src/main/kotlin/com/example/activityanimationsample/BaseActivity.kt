package com.example.activityanimationsample

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SwitchCompat

abstract class BaseActivity : AppCompatActivity() {

    abstract val layoutId: Int
    abstract val destinationIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if ((application as SampleApp).noWindowAnimation) {
            setTheme(R.style.AppThemeNoAnimation)
        } else {
            setTheme(R.style.AppTheme)
        }

        setContentView(layoutId)
        initView()
    }

    private fun initView() {
        title = this.localClassName
        findViewById<TextView>(R.id.change_activity_textview).setOnClickListener { switchActivity() }
        findViewById<SwitchCompat>(R.id.no_window_animation_switch).apply {
            isChecked = (application as SampleApp).noWindowAnimation
            jumpDrawablesToCurrentState()
            setOnCheckedChangeListener { _, isChecked ->
                (application as SampleApp).noWindowAnimation = isChecked
            }
        }
        findViewById<SwitchCompat>(R.id.override_pending_transition_switch).apply {
            isChecked = (application as SampleApp).overridePendingTransition
            jumpDrawablesToCurrentState()
            setOnCheckedChangeListener { _, isChecked ->
                (application as SampleApp).overridePendingTransition = isChecked
            }
        }
    }

    private fun switchActivity() {
        this.startActivity(destinationIntent)
        if ((application as SampleApp).overridePendingTransition) {
            this.overridePendingTransition(0, 0)
        }
        this.finish()
        if ((application as SampleApp).overridePendingTransition) {
            this.overridePendingTransition(0, 0)
        }
    }
}
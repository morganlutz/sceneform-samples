package com.morgan.samples.sceneformsample

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ArSceneSampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arscene_sample)
    }

    companion object {
        fun navigate(activity: Activity) {
            activity.startActivity(Intent(activity, ArSceneSampleActivity::class.java))
        }
    }
}
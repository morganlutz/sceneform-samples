package com.morgan.samples.sceneformsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LauncherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.sceneviewSampleButton).setOnClickListener {
            SceneviewSampleActivity.navigate(this)
        }
        findViewById<Button>(R.id.arSampleButton).setOnClickListener {
            ArSceneSampleActivity.navigate(this)
        }
    }
}

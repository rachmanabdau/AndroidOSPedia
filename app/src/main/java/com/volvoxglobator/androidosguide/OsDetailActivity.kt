package com.volvoxglobator.androidosguide

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class OsDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_os_detail)
        if (null != actionBar) {
            actionBar!!.title = "Detail"
        }

        val osImage: ImageView = findViewById(R.id.os_image)
        val osName: TextView = findViewById(R.id.os_name)
        val osLevel: TextView = findViewById(R.id.os_level)
        val osDescription: TextView = findViewById(R.id.os_description)

        val defaultImage = R.drawable.ic_launcher_background
        val defaultString = R.string.placeholder_default

        if (intent.extras != null) {
            osImage.setImageResource(intent.getIntExtra(MainActivity.OS_IMAGE, defaultImage))
            osName.text = intent.getStringExtra(MainActivity.OS_NAME)
            osLevel.text = getString(intent.getIntExtra(MainActivity.OS_API_LEVEL, defaultString))
            osDescription.text =
                getString(intent.getIntExtra(MainActivity.OS_DESCRIPTION, defaultString))
        }
    }
}

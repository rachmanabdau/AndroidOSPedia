package com.volvoxglobator.androidosguide

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object {
        const val OS_IMAGE = "os_image"
        const val OS_NAME = "os_name"
        const val OS_DESCRIPTION = "os_Description"
        const val OS_API_LEVEL = "api_level"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.adapter = GridAdapter(OnClickListener { data ->
            val intent = Intent(this@MainActivity, OsDetailActivity::class.java).also {
                it.putExtra(OS_IMAGE, data.img)
                it.putExtra(OS_NAME, data.versionName)
                it.putExtra(OS_DESCRIPTION, data.description)
                it.putExtra(OS_API_LEVEL, data.apiLevel)
            }
            startActivity(intent)
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.overflow_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.profile_menu -> {
                val intent = Intent(this@MainActivity, ProfileActivity::class.java)
                startActivity(intent)
            }
        }

        return super.onOptionsItemSelected(item)
    }
}

package com.example.androidmanifest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androidmanifest.R
import com.example.androidmanifest.icons

class MainActivity : AppCompatActivity() {

    private lateinit var RecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        RecyclerView = findViewById(R.id.recylerView)
        val icons = ArrayList<icons>()
        icons.add(icons(1, "Games", R.drawable.ic_baseline_games))
        icons.add(icons(2, "MUSICS", R.drawable.ic_baseline_music_note))
        icons.add(icons(3, "FILES", R.drawable.ic_baseline_file_copy))
        icons.add(icons(4, "KEYBOARD", R.drawable.ic_baseline_keyboard))
        icons.add(icons(5, "TRASNPORT", R.drawable.ic_baseline_directions_car))
        icons.add(icons(6, "BOOKS", R.drawable.ic_baseline_menu_book))
        icons.add(icons(7, "PHOTOS", R.drawable.ic_baseline_image))
        icons.add(icons(8, "APP", R.drawable.ic_baseline_android_24))
        icons.add(icons(9, "LAPTOPS", R.drawable.ic_baseline_laptop))
        icons.add(icons(10, "SMARTPHONES", R.drawable.ic_baseline_smartphone))

            val adapter = IconAdapter(icons)

        RecyclerView.adapter = adapter
        RecyclerView.layoutManager = LinearLayoutManager(this)
    }
}
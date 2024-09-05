package com.hedroid.customeloading


import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import com.github.ybq.android.spinkit.sprite.Sprite
import com.github.ybq.android.spinkit.style.WanderingCubes


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val progressBar = findViewById<View>(R.id.spin_kit) as ProgressBar
        val doubleBounce: Sprite = WanderingCubes()
        progressBar.indeterminateDrawable = doubleBounce

    }
}
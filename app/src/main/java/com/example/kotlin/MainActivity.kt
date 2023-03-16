package com.example.kotlin

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding
    val a = 324
    val b = 321
    var result : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.b1.setOnClickListener {
            result = a + b
            bindingClass.t1.text = "Результат $result"
        }

        bindingClass.b2.setOnClickListener {
            result = a - b
            bindingClass.t1.text = "Результат $result"
        }

        bindingClass.b3.setOnClickListener {
            result = a * b
            bindingClass.t1.text = "Результат $result"
        }
    }
}
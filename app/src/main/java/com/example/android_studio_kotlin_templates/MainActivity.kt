package com.example.android_studio_kotlin_templates

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android_studio_kotlin_templates.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.next.setOnClickListener{
            val bundle = Bundle()
            bundle.putString("name", binding.nameField.text.toString())

            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}
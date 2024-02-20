package ru.earn1ll.gamecubes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.earn1ll.gamecubes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
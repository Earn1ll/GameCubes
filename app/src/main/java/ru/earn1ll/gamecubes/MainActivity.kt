package ru.earn1ll.gamecubes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import ru.earn1ll.gamecubes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            rollDice()
        }

    }
    private fun rollDice() {
        val dice = Dice(6)
        val roll = dice.roll()
        binding.tvResult.text = roll.toString()
    }
}
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
        when(roll) {
            1->  binding.imDice.setImageResource(R.drawable.dice_one)
            2->  binding.imDice.setImageResource(R.drawable.dice_two)
            3->  binding.imDice.setImageResource(R.drawable.dice_three)
            4->  binding.imDice.setImageResource(R.drawable.dice_four)
            5->  binding.imDice.setImageResource(R.drawable.dice_five)
            6->  binding.imDice.setImageResource(R.drawable.dice_six)
        }
        binding.tvResult.text = roll.toString()
    }
}
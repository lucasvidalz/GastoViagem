package com.example.gastoviagem
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.gastoviagem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val initialText = getString(R.string.total_value, 0.0)
        binding.totalValue.text = initialText

        binding.buttonCalculate.setOnClickListener {
            val distance = binding.editDistance.text.toString().toDouble()
            val price = binding.editPrice.text.toString().toDouble()
            val autonomy = binding.editAutonomy.text.toString().toDouble()
            val totalValue = distance/autonomy * price
            binding.totalValue.text =  getString(R.string.total_value, totalValue)
        }

    }


}


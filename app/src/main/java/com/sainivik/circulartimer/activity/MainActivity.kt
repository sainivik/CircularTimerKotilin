package com.sainivik.circulartimer.activity

import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.sainivik.circulartimer.R
import com.sainivik.circulartimer.circularTimer.CircularTimerListener
import com.sainivik.circulartimer.circularTimer.TimeFormatEnum
import com.sainivik.circulartimer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setTimer()
        setListener()
    }

    private fun setTimer() {
        binding.timerText = 50.toString()
        Handler().postDelayed(Runnable {
            binding.progressCircular.progress = 0f
            binding.progressCircular.startTimer()
        }, 1000)
    }

    private fun setListener() {

        binding.progressCircular.setCircularTimerListener(object : CircularTimerListener {
            override fun updateDataOnTick(remainingTimeInMs: Long): String {
                binding.timerText =
                    (Math.ceil((remainingTimeInMs / 1000f).toDouble())).toInt().toString()
                return Math.ceil((remainingTimeInMs / 1000f).toDouble()).toString()
            }

            override fun onTimerFinished() {
                Toast.makeText(this@MainActivity, "time is over", Toast.LENGTH_LONG).show()


            }
        }, 50, TimeFormatEnum.SECONDS, 10)


    }

}
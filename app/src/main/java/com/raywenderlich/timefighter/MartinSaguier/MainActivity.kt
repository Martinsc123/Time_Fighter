package com.raywenderlich.timefighter.MartinSaguier

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.PersistableBundle
import android.service.autofill.FillEventHistory
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    internal var score = 0

    internal lateinit var tapMeButton: Button
    internal lateinit var scoreTextView: TextView
    internal lateinit var timerTextView: TextView

    internal var gameStarted= false

    internal lateinit var countDownTimer: CountDownTimer
    internal var initialCountDown: Long=60000
    internal var countDownInterval: Long = 1000
    internal var timeLeftOnTimer: Long = 600000

    companion object{
        private val TAG = MainActivity::class.java.simpleName
        private const val SCORE_KEY = "SCORE KEY"
        private const val TIME_LEFT_KEY = "TIME_LEFT_KEY"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_acceso)

      /* Log.d(TAG, "onCreate called. Score is: $score")

        tapMeButton = findViewById(R.id.tapMeButton)
        scoreTextView = findViewById(R.id.scoreTextView)
        timerTextView = findViewById(R.id.timerTextView)
        tapMeButton.setOnClickListener{ view ->
            incrementScore()
        }

        if (savedInstanceState != null){
            score = savedInstanceState.getInt(SCORE_KEY)
            timeLeftOnTimer = savedInstanceState.getLong(TIME_LEFT_KEY)
            restoregame()
        }   else{
            resetGame()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putInt(SCORE_KEY, score)
        outState.putLong(TIME_LEFT_KEY, timeLeftOnTimer)
        countDownTimer.cancel()

        Log.d(TAG, "onSaveInstanceState: Saving Score: $score &time $timeLeftOnTimer")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy called.")
    }
    private fun resetGame() {
        score = 0

        scoreTextView.text = getString(R.string.yourScore, score)

        val initialTimeLeft = initialCountDown / 1000
        timerTextView.text = getString(R.string.time_Remaining, initialTimeLeft)

        countDownTimer = object : CountDownTimer(initialCountDown, countDownInterval) {
            override fun onTick(millisUntilFinished: Long) {
                timeLeftOnTimer =  millisUntilFinished
                val time_Remaining = millisUntilFinished / 1000
                timerTextView.text = getString(R.string.time_Remaining, time_Remaining)
            }

            override fun onFinish() {
                endGame()
            }
        }
        gameStarted = false
    }
    private fun restoregame(){
        scoreTextView.text = getString(R.string.yourScore, score)

        val restoredTime = timeLeftOnTimer / 1000
        timerTextView.text = getString(R.string.time_Remaining, restoredTime)

        countDownTimer = object : CountDownTimer(timeLeftOnTimer, countDownInterval) {
            override fun onTick(millisUntilFinished: Long) {
                timeLeftOnTimer = millisUntilFinished
                val timeLeft = millisUntilFinished / 1000
                timerTextView.text = getString(R.string.time_Remaining, timeLeft)
            }

            override fun onFinish() {
                endGame()
            }
        }

        countDownTimer.start()
        gameStarted = true
    }
    private fun incrementScore() {
        if(!gameStarted) {
            startGame()
        }
        score += 1
        val newScore = getString(R.string.yourScore, score)
        scoreTextView.text = newScore

    }
    private fun startGame(){
        countDownTimer.start()
        gameStarted = true
    }
    private fun endGame(){
        Toast.makeText(this, getString(R.string.gameOverMessage, score), Toast.LENGTH_LONG).show()
        resetGame()
    }*/
}}

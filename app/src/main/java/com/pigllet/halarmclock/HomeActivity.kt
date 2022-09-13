package com.pigllet.halarmclock

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.pigllet.halarmclock.alarmclock.activities.MainActivity
import com.pigllet.halarmclock.iap.activities.IAPActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        findViewById<Button>(R.id.btnList).setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        findViewById<Button>(R.id.btnSub).setOnClickListener {
            startActivity(Intent(this, IAPActivity::class.java))
        }
    }
}
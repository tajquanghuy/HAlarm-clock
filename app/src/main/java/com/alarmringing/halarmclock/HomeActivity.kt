package com.alarmringing.halarmclock

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.alarmringing.halarmclock.alarmclock.activities.MainActivity
import com.alarmringing.halarmclock.iap.activities.IAPActivity
import com.alarmringing.halarmclock.ui.activity.AlarmMainActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        findViewById<Button>(R.id.btnList).setOnClickListener {
            startActivity(Intent(this, AlarmMainActivity::class.java))
        }
        findViewById<Button>(R.id.btnSub).setOnClickListener {
            startActivity(Intent(this, IAPActivity::class.java))
        }
    }
}
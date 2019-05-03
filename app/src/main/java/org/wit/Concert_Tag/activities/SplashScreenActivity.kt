package org.wit.Concert_Tag.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.wit.Concert_Tag.R
import java.util.*

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
    Timer().schedule( object : TimerTask(){
        override fun run() {
         val intent=Intent(this@SplashScreenActivity,PlacemarkListActivity::class.java)
        startActivity(intent)
            finish()
        }
      } ,1200L)
    }
}

package com.berinteker.gecisuygulamasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonA.setOnClickListener {
            val intent = Intent(this@MainActivity,SayfaAActivity::class.java)
            startActivity(intent)
        }

        buttonX.setOnClickListener {
            val intent = Intent(this@MainActivity,SayfaXActivity::class.java)
            startActivity(intent)
        }
    }
    override fun onBackPressed() {
        val cikisIntent = Intent(Intent.ACTION_MAIN)//anasayfaya dönmeyi yarayan yapı
        cikisIntent.addCategory(Intent.CATEGORY_HOME)//
        cikisIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)//yeni uygulama için hazırım demek
        startActivity(cikisIntent)
    }
}
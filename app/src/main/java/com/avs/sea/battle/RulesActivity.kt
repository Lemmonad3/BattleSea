package com.avs.sea.battle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.avs.sea.battle.main.MainActivity

class RulesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rules)

        val button: Button = findViewById(R.id.back)
        button.setOnClickListener{

            val intent: Intent = Intent(this@RulesActivity, InputActivity ::class.java)
            startActivity(intent)
        }
    }
}
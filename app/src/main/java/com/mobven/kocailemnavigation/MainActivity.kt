package com.mobven.kocailemnavigation


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.EntryPointAccessors

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val factory = EntryPointAccessors.fromActivity(this, ActivityFactory::class.java)
        val activityA = factory.getActivityA().instantiate()
        val activityB = factory.getActivityB().instantiate()

        findViewById<MaterialButton>(R.id.btn_a).setOnClickListener {
            val intent = Intent(this, activityA::class.java)
            startActivity(intent)
        }

        findViewById<MaterialButton>(R.id.btn_b).setOnClickListener {
            val intent = Intent(this, activityB::class.java)
            startActivity(intent)
        }

    }
}

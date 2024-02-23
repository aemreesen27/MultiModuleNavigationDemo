package com.mobven.featurea

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.mobven.core.ActivityFactory
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.EntryPointAccessors

@AndroidEntryPoint
class ActivityA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)


        val factory = EntryPointAccessors.fromActivity(this, ActivityFactory::class.java)
        val activityMain = factory.getMainActivity().instantiate()


        findViewById<MaterialButton>(R.id.btn_go_to_main).setOnClickListener {
            val intent = Intent(this, activityMain::class.java)
            startActivity(intent)
        }

    }
}
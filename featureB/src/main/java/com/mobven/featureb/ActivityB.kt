package com.mobven.featureb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton
import com.mobven.core.ActivityFactory
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.EntryPointAccessors

@AndroidEntryPoint
class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        val factory = EntryPointAccessors.fromActivity(this, ActivityFactory::class.java)
        val activityA = factory.getActivityA().instantiate()


        findViewById<MaterialButton>(R.id.btn_go_to_a).setOnClickListener {
            val intent = Intent(this, activityA::class.java)
            startActivity(intent)
        }


    }
}
package com.fernandomantoan.hiltworkmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import com.fernandomantoan.hiltworkmanager.worker.LoopWorker

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initWorker()
    }

    private fun initWorker() {
        val request = OneTimeWorkRequestBuilder<LoopWorker>().build()
        WorkManager.getInstance(applicationContext).enqueue(request)
    }
}
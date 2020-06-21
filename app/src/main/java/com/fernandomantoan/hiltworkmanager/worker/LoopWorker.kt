package com.fernandomantoan.hiltworkmanager.worker

import android.content.Context
import android.util.Log
import androidx.hilt.Assisted
import androidx.hilt.work.WorkerInject
import androidx.work.Worker
import androidx.work.WorkerParameters

class LoopWorker @WorkerInject constructor(
    @Assisted appContext: Context,
    @Assisted workerParams: WorkerParameters,
    val workerDependency: WorkerDependency
) : Worker(appContext, workerParams) {
    override fun doWork(): Result {

        Log.d("HILTWORKER", "WorkManager started, loop interval is " +
                "${workerDependency.loopInterval}")

        var loop = 0
        while (true) {
            Log.d("HILTWORKER", "Loop number ${loop}")

            if (loop >= workerDependency.loopInterval) {
                break
            }
            Thread.sleep(1000)
            loop++
        }

        return Result.success()
    }
}
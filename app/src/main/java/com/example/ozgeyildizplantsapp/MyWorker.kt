package com.example.ozgeyildizplantsapp

import android.content.Context
import androidx.work.*
import androidx.work.CoroutineWorker

class MyWorker(context: Context, workerParameter: WorkerParameters) : CoroutineWorker(context,workerParameter) {
    override suspend fun doWork(): Result {
        TODO("Not yet implemented")
    }


    //override suspend fun doWork() : Result {
   //     val outputData = workDataOf("isSuccess")
    //}


}
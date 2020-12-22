package com.sainivik.circulartimer.circularTimer

interface CircularTimerListener {
    fun updateDataOnTick(remainingTimeInMs: Long): String?
    fun onTimerFinished()
}
package com.advantal.myapplication;

import android.os.CountDownTimer;
import android.util.Log;

/**
 * Created by Sonam on 29-04-2022 14:08.
 */
public class MyCountDownTimer extends CountDownTimer {
    private  long interval = 1 * 1000;
    private  long startTime = 1 * 60 * 1000; // 1 MINS IDLE TIME

    public MyCountDownTimer(long millisInFuture, long countDownInterval) {
        super(millisInFuture, countDownInterval);
    }

//    public MyCountDownTimer(long millisInFuture, long countDownInterval) {
//        super(startTime, interval);
//    }

    @Override
    public void onFinish() {
        //DO WHATEVER YOU WANT HERE
        Log.e("Test", " ---onFinish");
    }

    @Override
    public void onTick(long millisUntilFinished) {
        Log.e("Test", " ---onTick");

    }
}


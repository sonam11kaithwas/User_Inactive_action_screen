package com.advantal.myapplication;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private final long interval = 1 * 1000;
    private final long startTime = 1 * 60 * 1000; // 1 MINS IDLE TIME
    MyCountDownTimer countDownTimer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("Test", " ---onCreate");
        countDownTimer = new MyCountDownTimer(startTime, interval);
        timeCounterReset(countDownTimer);

    }

    private void timeCounterReset(MyCountDownTimer countDownTimer) {
        if (countDownTimer != null) {
            countDownTimer.cancel();
            countDownTimer.start();
        }
    }

    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
        Log.e("Test", " ---user interaction...");

        //Reset the timer on user interaction...
        timeCounterReset(countDownTimer);
    }


}



package com.example.android.myhandler;

import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class MainActivity extends AppCompatActivity {

    MyThread myThread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myThread = new MyThread();
        myThread.start();
    }

    public void sendMessage(View view) {
        myThread.handler.post(new Runnable() {
            @Override
            public void run() {
                L.m(Thread.currentThread().getName());
            }
        });
    }
}

class MyThread extends Thread {
    Handler handler;

    public MyThread() {

    }

    @Override
    public void run() {
        Looper.prepare(); // prepare this thread with its own message queue
        handler = new Handler(); // handler init here for the background thread
        Looper.loop(); // run the looper

    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uas.stopwatch.latihan.app.controller;

import com.uas.stopwatch.latihan.app.util.TimerListener;

/**
 *
 * @author LENOVO
 */
public class TimerController implements Runnable {
    private boolean running = false;
    private int seconds = 0;
    private TimerListener listener;


    public TimerController(TimerListener listener) {
        this.listener = listener;
    }

    public void start(int durationInSeconds) {
        running = true;
        seconds = durationInSeconds;

        Thread thread = new Thread(this);
        thread.start();
    }

    public void stop() {
        running = false;
    }

    @Override
    public void run() {
        while (running && seconds > 0) {
            try {
                Thread.sleep(1000); // tunggu 1 detik
                seconds--;
                listener.onTick(seconds);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        if (running && seconds == 0) {
            listener.onFinish();
        }

        running = false;
    } 
}

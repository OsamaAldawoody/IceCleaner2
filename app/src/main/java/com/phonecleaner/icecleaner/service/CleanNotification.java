package com.phonecleaner.icecleaner.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.phonecleaner.icecleaner.receiver.Alarm;

public class CleanNotification extends Service {
    Alarm alarm = new Alarm();

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        alarm.setAlarm(this);
        return START_STICKY;
    }

    @Override
    public void onStart(Intent intent, int startId)
    {
        alarm.setAlarm(this);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        alarm.setAlarm(this);
        return null;
    }
}

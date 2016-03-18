package com.newfeds.icare.BroadcastReceivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.newfeds.icare.helper.L;


/**
 * Created by GT on 1/23/2016.
 */
public class AlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        L.log("Alarm recived");
    }
}

package com.example.user.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;


public class TestReceiver extends BroadcastReceiver {
    public TestReceiver() {
           }

           @Override
    public void onReceive(Context context, Intent intent) {
               if (intent.getAction().equals("com.example.user.broadcast.START_APP")) {
                       Toast.makeText(context,"Aplicatia este functionala", Toast.LENGTH_LONG).show();
                  }
    }
}


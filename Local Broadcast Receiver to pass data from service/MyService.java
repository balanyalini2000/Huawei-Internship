package com.example.localbroadcastreceiverapp1;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import static androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance;

public class MyService extends IntentService {
    public static final String NOTIFICATION = "MyService";
    public static final String activityMsg = "Message from activity";
    public static final String serviceMsg = "Message from service";

    public MyService() {
        super("MyService");
    }

    protected void onHandleIntent(Intent intent) {
        String data = intent.getStringExtra("activityMessage");
        Log.i("msg", "Received msg from activity");
        Intent newIntent = new Intent(NOTIFICATION);
        //sending activity's message to service back to activity
        newIntent.putExtra("activityMsg", data);
        //this the service's message to activity
        String msgToActivity = "Hello Activity";
        newIntent.putExtra("serviceMsg", msgToActivity);
        getInstance(getApplicationContext()).sendBroadcast(newIntent);
    }
}


package com.example.localbroadcastreceiverapp1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import static androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button button;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textViewDisplay);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MyService.class);
                //This is the message being sent from activity to service
                String messageToService = editText.getText().toString();
                intent.putExtra("activityMessage", messageToService);
                startService(intent);
                Log.i("msg", "Message sent from activity to service");
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter i = new IntentFilter(MyService.NOTIFICATION);
        getInstance(getApplicationContext()).registerReceiver(myReceiver,i);
        Log.i("msg", "Registered receiver");
    }

    @Override
    protected void onStop() {
        super.onStop();
        getInstance(getApplicationContext()).unregisterReceiver(myReceiver);
        Log.i("msg", "Unregistered receiver");
    }

    private BroadcastReceiver myReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            Bundle bundle = intent.getExtras();
            String activityMsg = bundle.getString("activityMsg");
            String serviceMsg = bundle.getString("serviceMsg");
            Log.i("msg", "Service messages received");
            textView.setText("Activity's msg: " + activityMsg  + "\n" + "Service's msg: " + serviceMsg);
        }
    };
}


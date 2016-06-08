package br.com.clairtonluz.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class BoundServiceActivity extends AppCompatActivity {

    private Intent boundServiceIntent;
    private BoundService boundService;
    private boolean isServiceBound;
    private ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            System.out.println("onServiceConnected");
            BoundService.LocalBinder binder = (BoundService.LocalBinder) service;
            boundService = binder.getService();
            isServiceBound = true;
            System.out.println("onServiceConnected 2");
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            isServiceBound = false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bound_service);
        boundServiceIntent = new Intent(this, BoundService.class);

        startService(boundServiceIntent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (isServiceBound) {
            boundService.stopSelf();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        bindService(boundServiceIntent, serviceConnection, Context.BIND_AUTO_CREATE);
    }

    @Override
    protected void onStop() {
        super.onStop();
        unbindService(serviceConnection);
    }

    public void start(View view) {
        System.out.println("start");
        if (isServiceBound) {
            boundService.startCounter();
        }
    }

    public void stop(View view) {
        if (isServiceBound) {
            boundService.stopCounter();
        }
    }
}

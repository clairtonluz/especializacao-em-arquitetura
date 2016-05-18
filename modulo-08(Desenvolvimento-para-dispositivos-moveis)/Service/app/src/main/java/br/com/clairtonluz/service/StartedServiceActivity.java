package br.com.clairtonluz.service;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class StartedServiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_started_service);

        Intent it = new Intent(this, StartedService.class);
        startService(it);
    }

    public void start(View view) {
        Intent it = new Intent(this, StartedService.class);
        startService(it);
    }
}

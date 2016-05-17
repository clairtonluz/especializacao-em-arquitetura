package br.com.clairtonluz.examplebluetooth;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class BTReceiver extends BroadcastReceiver {
    private List<BluetoothDevice> devices;

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();

        if (BluetoothAdapter.ACTION_DISCOVERY_STARTED.equals(action)) {
            devices = new ArrayList<>();
            Log.i("App", "Processo de discovery iniciando...");
        } else if (BluetoothDevice.ACTION_FOUND.equals(action)) {
            BluetoothDevice device = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
            devices.add(device);
            Log.i("App", "... Novo dispositivo encontrado: " + device.getAddress());
        } else if (BluetoothAdapter.ACTION_DISCOVERY_FINISHED.equals(action)) {
            Log.i("App", "Processo de discovery finalizando...");
            for (BluetoothDevice device : devices) {
                Log.i("App", "Nome: " + device.getName() + ", End: " + device.getAddress());
            }
        }
    }
}

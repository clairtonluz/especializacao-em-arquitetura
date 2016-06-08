package br.com.clairtonluz.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by clairton on 18/05/16.
 */
public class BoundService extends Service {

    private boolean stop;
    private IBinder binder;
    private boolean isCountStarted;

    public BoundService(IBinder binder) {
        this.binder = new LocalBinder();
    }

    public void startCounter() {
        System.out.println("startCounter");
        if (!isCountStarted) {
            System.out.println("startCounter true");
            isCountStarted = true;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("startCounter run");
                    long count = 0;
                    while (!stop) {
                        System.out.println("startCounter while");
                        try {
                            Log.i("App", "Valor: " + count);
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    isCountStarted = false;
                    stop = false;
                }
            }).start();
        }
    }

    public void stopCounter() {
        this.stop = true;
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return binder;
    }

    public class LocalBinder extends Binder {
        public BoundService getService() {
            return BoundService.this;
        }
    }
}

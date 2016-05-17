package br.com.clairtonluz.broadcastreceiver;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by clairton on 16/05/16.
 */
public class MyBroadcastReceiver extends BroadcastReceiver {
    private static final int NOTIFICATION_ID = 1;
    private static final int NOTIFICATION_PENDING_INTENT = 2;

    @Override
    public void onReceive(Context context, Intent intent) {
        System.out.println(intent.getAction());

        TaskStackBuilder stackBuilder = TaskStackBuilder.create(context);
        stackBuilder.addParentStack(ChuckNorrisActivity.class);
        stackBuilder.addNextIntent(new Intent(context, ChuckNorrisActivity.class));

        PendingIntent pendingIntent = stackBuilder
                .getPendingIntent(NOTIFICATION_PENDING_INTENT, PendingIntent.FLAG_UPDATE_CURRENT);

        Notification.Builder builder = new Notification.Builder(context)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("Chuck Norris Notification")
                .setContentText("Clique aqui para completar sua missão")
                .setContentIntent(pendingIntent)
                .setAutoCancel(true);

        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(NOTIFICATION_ID, builder.build());

    }
}

package md.iecs.fcu.androidhw4_receiver;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by willc on 2017/4/25.
 */

public class Waitingmsg extends BroadcastReceiver{

    static int id = 70000;

    @Override
    public void onReceive(Context context, Intent intent) {
        String msg=intent.getStringExtra("msg_data");
        Intent notidata=new Intent();
        notidata.setClass(context,sayhello.class);
        notidata.putExtra("msg_data",msg);
        PendingIntent pendingIntent=PendingIntent.getActivity(context,0,notidata,PendingIntent.FLAG_ONE_SHOT);
        Notification notify=newNotification(context,pendingIntent,"(new) Broadcast is received.");
        NotificationManager manager=(NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(id++,notify);
    }
    @SuppressLint("Newapi")
    Notification newNotification(Context context,PendingIntent pi,String title){
        Notification.Builder builder=new Notification.Builder(context);
        builder.setContentTitle(title);
        builder.setContentText("hello");
        builder.setSmallIcon(R.mipmap.ic_launcher);
        builder.setContentIntent(pi);
        builder.setWhen(System.currentTimeMillis());
        Notification notify=builder.build();
        return notify;
    }
}

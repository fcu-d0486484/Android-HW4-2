package md.iecs.fcu.androidhw4_receiver;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Waitingmsg receiver=new Waitingmsg();
        IntentFilter filter=new IntentFilter("hw4.msg");
        registerReceiver(receiver,filter);
    }
}

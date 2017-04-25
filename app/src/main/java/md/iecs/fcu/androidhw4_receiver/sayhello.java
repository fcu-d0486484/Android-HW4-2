package md.iecs.fcu.androidhw4_receiver;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by willc on 2017/4/25.
 */
public class sayhello extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView show=(TextView)findViewById(R.id.nameshow);
        Intent intent=getIntent();
        String msg=intent.getStringExtra("msg_data");
        show.setText("Hello "+msg);
    }
}

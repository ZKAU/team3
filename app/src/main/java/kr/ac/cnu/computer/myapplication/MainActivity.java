package kr.ac.cnu.computer.myapplication;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int[] n = {0};
        AlarmManager alarmManager=(AlarmManager) getSystemService(Context.ALARM_SERVICE);
        PendingIntent pendingIntent=PendingIntent.getService(context,requestId,intent,PendingIntent.FLAG_NO_CREATE);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView time=(TextView) findViewById(R.id.time11);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                // 인텐트 객체 생성
                n[0]=0;


                new Thread(new Runnable() {
                    @Override public void run() {

                        while (n[0]==0) {
                            Intent intent = new Intent(getApplication(), SOSPopupActivity.class);
                            startActivityForResult(intent, 1000);
                            try {
                            Thread.sleep(5000);
                            }
                            catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }).start();

            }

        });
        Button button2 =(Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n[0]=1;

            }
        });
    }
}
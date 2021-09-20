package com.example.bbsbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class TransactionProcessing extends AppCompatActivity {

    ProgressBar progressBar;
    int count;
    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trasaction_processing);

        progressBar=findViewById(R.id.progressBar);
        timer=new Timer();
        TimerTask timerTask=new TimerTask() {
            @Override
            public void run() {
                count ++;
                progressBar.setProgress(count);
                if (count==100){
                    Intent intent=new Intent(TransactionProcessing.this,SendToUserList.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
        timer.schedule(timerTask,0,100);
    }
}
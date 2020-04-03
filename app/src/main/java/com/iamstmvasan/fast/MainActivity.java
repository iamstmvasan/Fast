package com.iamstmvasan.fast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,start;
    TextView t1 ,timer ,bestScore;
    int click = 1;
    int seconds = 0;
    CountDownTimer cdt;
    SQLiteDatabase db;
    List<Integer> li , li2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b10 = findViewById(R.id.b10);
        b11 = findViewById(R.id.b11);
        b12 = findViewById(R.id.b12);
        b13 = findViewById(R.id.b13);
        b14 = findViewById(R.id.b14);
        b15 = findViewById(R.id.b15);
        b16 = findViewById(R.id.b16);
        b17 = findViewById(R.id.b17);
        b18 = findViewById(R.id.b18);
        b19 = findViewById(R.id.b19);
        b20 = findViewById(R.id.b20);
        b21 = findViewById(R.id.b21);
        b22 = findViewById(R.id.b22);
        b23 = findViewById(R.id.b23);
        b24 = findViewById(R.id.b24);
        b25 = findViewById(R.id.b25);

        start = findViewById(R.id.button3);

        timer = findViewById(R.id.timer);
        bestScore = findViewById(R.id.bestScore);

        t1 = findViewById(R.id.textView);

        db = openOrCreateDatabase("Fast", Context.MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS student(timing VARCHAR);");

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(String.valueOf(click));

                li = new ArrayList();
                for(int i=1;i<=25;i++){
                    li.add(i);
                }
                Collections.shuffle(li);

                li2 = new ArrayList();
                for(int i=26;i<=50;i++){
                    li2.add(i);
                }
                Collections.shuffle(li2);

                b1.setText(String.valueOf(li.get(0)));
                b2.setText(String.valueOf(li.get(1)));
                b3.setText(String.valueOf(li.get(2)));
                b4.setText(String.valueOf(li.get(3)));
                b5.setText(String.valueOf(li.get(4)));
                b6.setText(String.valueOf(li.get(5)));
                b7.setText(String.valueOf(li.get(6)));
                b8.setText(String.valueOf(li.get(7)));
                b9.setText(String.valueOf(li.get(8)));
                b10.setText(String.valueOf(li.get(9)));
                b11.setText(String.valueOf(li.get(10)));
                b12.setText(String.valueOf(li.get(11)));
                b13.setText(String.valueOf(li.get(12)));
                b14.setText(String.valueOf(li.get(13)));
                b15.setText(String.valueOf(li.get(14)));
                b16.setText(String.valueOf(li.get(15)));
                b17.setText(String.valueOf(li.get(16)));
                b18.setText(String.valueOf(li.get(17)));
                b19.setText(String.valueOf(li.get(18)));
                b20.setText(String.valueOf(li.get(19)));
                b21.setText(String.valueOf(li.get(20)));
                b22.setText(String.valueOf(li.get(21)));
                b23.setText(String.valueOf(li.get(22)));
                b24.setText(String.valueOf(li.get(23)));
                b25.setText(String.valueOf(li.get(24)));

                start.setText("Try Again");
                start.setVisibility(View.INVISIBLE);
                if(start.getText().toString().equalsIgnoreCase("Try Again"));{
                    click = 1;
                    seconds = 0;
                    t1.setText(String.valueOf(click));

                    b1.setBackgroundResource(R.drawable.btn);
                    b2.setBackgroundResource(R.drawable.btn);
                    b3.setBackgroundResource(R.drawable.btn);
                    b4.setBackgroundResource(R.drawable.btn);
                    b5.setBackgroundResource(R.drawable.btn);
                    b6.setBackgroundResource(R.drawable.btn);
                    b7.setBackgroundResource(R.drawable.btn);
                    b8.setBackgroundResource(R.drawable.btn);
                    b9.setBackgroundResource(R.drawable.btn);
                    b10.setBackgroundResource(R.drawable.btn);
                    b11.setBackgroundResource(R.drawable.btn);
                    b12.setBackgroundResource(R.drawable.btn);
                    b13.setBackgroundResource(R.drawable.btn);
                    b14.setBackgroundResource(R.drawable.btn);
                    b15.setBackgroundResource(R.drawable.btn);
                    b16.setBackgroundResource(R.drawable.btn);
                    b17.setBackgroundResource(R.drawable.btn);
                    b18.setBackgroundResource(R.drawable.btn);
                    b19.setBackgroundResource(R.drawable.btn);
                    b20.setBackgroundResource(R.drawable.btn);
                    b21.setBackgroundResource(R.drawable.btn);
                    b22.setBackgroundResource(R.drawable.btn);
                    b23.setBackgroundResource(R.drawable.btn);
                    b24.setBackgroundResource(R.drawable.btn);
                    b25.setBackgroundResource(R.drawable.btn);

                    startTimer();
                    //cdt.start();
                }

            }
        });


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.valueOf(b1.getText().toString());
                if(num == click){
                    b1.setText(String.valueOf(li2.get(0)));
                    click++;
                    t1.setText(String.valueOf(click));
                    b1.setBackgroundResource(R.drawable.click_btn);
                }
                if(num >= 26){
                    b1.setBackgroundResource(R.drawable.btn);
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.valueOf(b2.getText().toString());
                if(num == click){
                    b2.setText(String.valueOf(li2.get(1)));
                    click++;
                    t1.setText(String.valueOf(click));
                    b2.setBackgroundResource(R.drawable.click_btn);
                }
                if(num >= 26){
                    b2.setBackgroundResource(R.drawable.btn);
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.valueOf(b3.getText().toString());
                if(num == click){
                    b3.setText(String.valueOf(li2.get(2)));
                    click++;
                    t1.setText(String.valueOf(click));
                    b3.setBackgroundResource(R.drawable.click_btn);
                }
                if(num >= 26){
                    b3.setBackgroundResource(R.drawable.btn);
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.valueOf(b4.getText().toString());
                if(num == click){
                    b4.setText(String.valueOf(li2.get(3)));
                    click++;
                    t1.setText(String.valueOf(click));
                    b4.setBackgroundResource(R.drawable.click_btn);
                }
                if(num >= 26){
                    b4.setBackgroundResource(R.drawable.btn);
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.valueOf(b5.getText().toString());
                if(num == click){
                    b5.setText(String.valueOf(li2.get(4)));
                    click++;
                    t1.setText(String.valueOf(click));
                    b5.setBackgroundResource(R.drawable.click_btn);
                }
                if(num >= 26){
                    b5.setBackgroundResource(R.drawable.btn);
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.valueOf(b6.getText().toString());
                if(num == click){
                    b6.setText(String.valueOf(li2.get(5)));
                    click++;
                    t1.setText(String.valueOf(click));
                    b6.setBackgroundResource(R.drawable.click_btn);
                }
                if(num >= 26){
                    b6.setBackgroundResource(R.drawable.btn);
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.valueOf(b7.getText().toString());
                if(num == click){
                    b7.setText(String.valueOf(li2.get(6)));
                    click++;
                    t1.setText(String.valueOf(click));
                    b7.setBackgroundResource(R.drawable.click_btn);
                }
                if(num >= 26){
                    b7.setBackgroundResource(R.drawable.btn);
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.valueOf(b8.getText().toString());
                if(num == click){
                    b8.setText(String.valueOf(li2.get(7)));
                    click++;
                    t1.setText(String.valueOf(click));
                    b8.setBackgroundResource(R.drawable.click_btn);
                }
                if(num >= 26){
                    b8.setBackgroundResource(R.drawable.btn);
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.valueOf(b9.getText().toString());
                if(num == click){
                    b9.setText(String.valueOf(li2.get(8)));
                    click++;
                    t1.setText(String.valueOf(click));
                    b9.setBackgroundResource(R.drawable.click_btn);
                }
                if(num >= 26){
                    b9.setBackgroundResource(R.drawable.btn);
                }
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.valueOf(b10.getText().toString());
                if(num == click){
                    b10.setText(String.valueOf(li2.get(9)));
                    click++;
                    t1.setText(String.valueOf(click));
                    b10.setBackgroundResource(R.drawable.click_btn);
                }
                if(num >= 26){
                    b10.setBackgroundResource(R.drawable.btn);
                }
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.valueOf(b11.getText().toString());
                if(num == click){
                    b11.setText(String.valueOf(li2.get(10)));
                    click++;
                    t1.setText(String.valueOf(click));
                    b11.setBackgroundResource(R.drawable.click_btn);
                }
                if(num >= 26){
                    b11.setBackgroundResource(R.drawable.btn);
                }
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.valueOf(b12.getText().toString());
                if(num == click){
                    b12.setText(String.valueOf(li2.get(11)));
                    click++;
                    t1.setText(String.valueOf(click));
                    b12.setBackgroundResource(R.drawable.click_btn);
                }
                if(num >= 26){
                    b12.setBackgroundResource(R.drawable.btn);
                }
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.valueOf(b13.getText().toString());
                if(num == click){
                    b13.setText(String.valueOf(li2.get(12)));
                    click++;
                    t1.setText(String.valueOf(click));
                    b13.setBackgroundResource(R.drawable.click_btn);
                }
                if(num >= 26){
                    b13.setBackgroundResource(R.drawable.btn);
                }
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.valueOf(b14.getText().toString());
                if(num == click){
                    b14.setText(String.valueOf(li2.get(13)));
                    click++;
                    t1.setText(String.valueOf(click));
                    b14.setBackgroundResource(R.drawable.click_btn);
                }
                if(num >= 26){
                    b14.setBackgroundResource(R.drawable.btn);
                }
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.valueOf(b15.getText().toString());
                if(num == click){
                    b15.setText(String.valueOf(li2.get(14)));
                    click++;
                    t1.setText(String.valueOf(click));
                    b15.setBackgroundResource(R.drawable.click_btn);
                }
                if(num >= 26){
                    b15.setBackgroundResource(R.drawable.btn);
                }
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.valueOf(b16.getText().toString());
                if(num == click){
                    b16.setText(String.valueOf(li2.get(15)));
                    click++;
                    t1.setText(String.valueOf(click));
                    b16.setBackgroundResource(R.drawable.click_btn);
                }
                if(num >= 26){
                    b16.setBackgroundResource(R.drawable.btn);
                }
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.valueOf(b17.getText().toString());
                if(num == click){
                    b17.setText(String.valueOf(li2.get(16)));
                    click++;
                    t1.setText(String.valueOf(click));
                    b17.setBackgroundResource(R.drawable.click_btn);
                }
                if(num >= 26){
                    b17.setBackgroundResource(R.drawable.btn);
                }
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.valueOf(b18.getText().toString());
                if(num == click){
                    b18.setText(String.valueOf(li2.get(17)));
                    click++;
                    t1.setText(String.valueOf(click));
                    b18.setBackgroundResource(R.drawable.click_btn);
                }
                if(num >= 26){
                    b18.setBackgroundResource(R.drawable.btn);
                }
            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.valueOf(b19.getText().toString());
                if(num == click){
                    b19.setText(String.valueOf(li2.get(18)));
                    click++;
                    t1.setText(String.valueOf(click));
                    b19.setBackgroundResource(R.drawable.click_btn);
                }
                if(num >= 26){
                    b19.setBackgroundResource(R.drawable.btn);
                }
            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.valueOf(b20.getText().toString());
                if(num == click){
                    b20.setText(String.valueOf(li2.get(19)));
                    click++;
                    t1.setText(String.valueOf(click));
                    b20.setBackgroundResource(R.drawable.click_btn);
                }
                if(num >= 26){
                    b20.setBackgroundResource(R.drawable.btn);
                }
            }
        });
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.valueOf(b21.getText().toString());
                if(num == click){
                    b21.setText(String.valueOf(li2.get(20)));
                    click++;
                    t1.setText(String.valueOf(click));
                    b21.setBackgroundResource(R.drawable.click_btn);
                }
                if(num >= 26){
                    b21.setBackgroundResource(R.drawable.btn);
                }
            }
        });
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.valueOf(b22.getText().toString());
                if(num == click){
                    b22.setText(String.valueOf(li2.get(21)));
                    click++;
                    t1.setText(String.valueOf(click));
                    b22.setBackgroundResource(R.drawable.click_btn);
                }
                if(num >= 26){
                    b22.setBackgroundResource(R.drawable.btn);
                }
            }
        });
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.valueOf(b23.getText().toString());
                if(num == click){
                    b23.setText(String.valueOf(li2.get(22)));
                    click++;
                    t1.setText(String.valueOf(click));
                    b23.setBackgroundResource(R.drawable.click_btn);
                }
                if(num >= 26){
                    b23.setBackgroundResource(R.drawable.btn);
                }
            }
        });
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.valueOf(b24.getText().toString());
                if(num == click){
                    b24.setText(String.valueOf(li2.get(23)));
                    click++;
                    t1.setText(String.valueOf(click));
                    b24.setBackgroundResource(R.drawable.click_btn);
                }
                if(num >= 26){
                    b24.setBackgroundResource(R.drawable.btn);
                }
            }
        });
        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.valueOf(b25.getText().toString());
                if(num == click){
                    b25.setText(String.valueOf(li2.get(24)));
                    click++;
                    t1.setText(String.valueOf(click));
                    b25.setBackgroundResource(R.drawable.click_btn);
                }
                if(num >= 26){
                    b25.setBackgroundResource(R.drawable.btn);
                }
            }
        });

    }

    private void startTimer() {
         cdt = new CountDownTimer(1000000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                if(click == 51){
                    t1.setText("Finished");
                    start.setVisibility(View.VISIBLE);
                    complete();
                }
                seconds++;
                int minutes = (int)(seconds/60);
                int s = (int)(seconds%60);


                String timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, s);
                timer.setText(timeLeftFormatted);
            }

            @Override
            public void onFinish() {

            }
        }.start();
    }

    private void complete() {
        cdt.cancel();

        /*db.execSQL("INSERT INTO Fast VALUES('"+seconds+"');");
        Cursor c=db.rawQuery("SELECT * FROM Fast WHERE timing='"+seconds+"'", null);
        if(c.moveToFirst()) {
            db.execSQL("UPDATE Fast SET timimg='" + seconds + "'WHERE timing ='"+seconds+"'");*/


        }

    }


package com.example.a1894082.a1894082_classactivity1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button toast_btn = (Button) findViewById(R.id.toast_btn);
        toast_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*String tag;
                Log.d(tag,name);
                Log.d(tag,email);
                Log.d(tag,password);*/

                Toast toast = Toast.makeText(getApplicationContext(), "Thanks", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 10, 10);
                toast.show();
                    }
                });

            }

        }

package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Button btn1 = findViewById(R.id.btn1);
            EditText ed1 = findViewById(R.id.ed1);
            TextView tv2 = findViewById(R.id.tv2);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Float met=Float.parseFloat(String.valueOf(ed1.getText()));
                    double inc= met/74.67;
                    tv2.setText("Converted Value In USD IS bots are youuu "+inc);

                }
            });

        }
    }




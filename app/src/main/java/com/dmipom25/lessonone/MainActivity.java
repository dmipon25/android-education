package com.dmipom25.lessonone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int counter = 2147483647;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView TextField = findViewById(R.id.counter);
        final Button ButtonInc = findViewById(R.id.increment);
        final Button ButtonDec = findViewById(R.id.decrement);

        TextField.setText(String.valueOf(counter));

        ButtonInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                TextField.setText(String.valueOf(counter));
            }
        });

        ButtonDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter--;
                TextField.setText(String.valueOf(counter));
            }
        });
    }
}

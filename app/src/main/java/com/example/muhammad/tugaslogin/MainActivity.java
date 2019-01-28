package com.example.muhammad.tugaslogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Typeface;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView teks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teks=(TextView)findViewById(R.id.font);

        Typeface customfont=Typeface.createFromAsset(getAssets(), "font/donatello.ttf");

teks.setTypeface(customfont);
    }
}

package com.example.muhammad.tugaslogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main2 );

    }



    public void pindahAct(View view) {
        startActivity(new Intent(Main2Activity.this, Login1.class) );
    }

    public void pindah2(View view) {
        startActivity(new Intent( Main2Activity.this, Login2.class));
    }
}

package com.ryukirigami.andoidcommonutilsmodule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.ryukirigami.commonutils.Math;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tx = findViewById(R.id.txt_demo);
        tx.setText("5 x 5 = " + Math.Times(5, 5));
    }
}

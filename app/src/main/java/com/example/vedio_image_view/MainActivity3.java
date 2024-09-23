package com.example.vedio_image_view;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import java.lang.String;
public class MainActivity3 extends AppCompatActivity {
    TextView tname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent i =getIntent();
        String n = i.getStringExtra("Name:");
        tname=findViewById(R.id.t_name);
        tname.setText(n);

    }
}
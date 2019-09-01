package com.example.user.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView tv2;
    String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv2=findViewById(R.id.textView2);

        st=getIntent().getExtras().getString("value5");
        tv2.setText(st.toUpperCase());

    }
}

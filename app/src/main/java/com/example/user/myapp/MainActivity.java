package com.example.user.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btp,btpl,btc ;
    EditText prime,pali,caps;
    String palindrome,cap,pmstr;
    int pm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caps=findViewById(R.id.all_caps);
        defineButtons();
    }
    public void defineButtons(){

        findViewById(R.id.button_caps).setOnClickListener(buttonClickListener);
    }




    private View.OnClickListener buttonClickListener;


    {
        buttonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (v.getId()) {


                    case R.id.button_caps:
                        Intent k=new Intent(MainActivity.this,Main2Activity.class);
                        cap=caps.getText().toString();
                        k.putExtra("value5",cap);
                        startActivity(k);
                        finish();
                        break;

                }


            }
        };
    }



}


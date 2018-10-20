package com.example.hunai.hackathon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BubblePicker extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bubble_picker);

        Button one =(Button) findViewById(R.id.button1);
        one.setOnClickListener(this);
        Button two =(Button) findViewById(R.id.button2);
        two.setOnClickListener(this);
        Button three =(Button) findViewById(R.id.button3);
        three.setOnClickListener(this);
        Button four =(Button) findViewById(R.id.button4);
        four.setOnClickListener(this);
        Button five =(Button) findViewById(R.id.button5);
        five.setOnClickListener(this);
        Button six =(Button) findViewById(R.id.button6);
        six.setOnClickListener(this);
        Button seven =(Button) findViewById(R.id.button7);
        seven.setOnClickListener(this);
        Button eight =(Button) findViewById(R.id.button8);
        eight.setOnClickListener(this);
        Button nine =(Button) findViewById(R.id.button9);
        nine.setOnClickListener(this);
        Button ten =(Button) findViewById(R.id.button10);
        ten.setOnClickListener(this);
        Button eleven =(Button) findViewById(R.id.button11);
        eleven.setOnClickListener(this);
        Button twelve =(Button) findViewById(R.id.button12);
        twelve.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                break;
            case R.id.button2:
                break;
            case R.id.button3:
                break;
            case R.id.button4:
                break;
            case R.id.button5:
                break;
            case R.id.button6:
                break;
            case R.id.button7:
                break;
            case R.id.button8:
                break;
            case R.id.button9:
                break;
            case R.id.button10:
                break;
            case R.id.button11:
                break;
            case R.id.button12:
                break;
            default:
                break;
        }
    }
}

package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    protected int soreNum;
    protected TextView textViewObj;

    private void firstThing() {
        soreNum = 0;
        TextView textViewObj = findViewById(R.id.textViewResult);
    }


    public void funcNumber(View view) {
        TextView textViewObj = findViewById(R.id.textViewResult);

        soreNum = Integer.parseInt((String) textViewObj.getText()) * 10;

        soreNum += Integer.parseInt((String) ((Button) view).getText());

        textViewObj.setText("" + soreNum);

    }

    public void funcClearAll(View view) {
        soreNum = 0;
        //textViewObj.setText("" + 0);
    }
}
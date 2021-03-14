package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int soreNum1, soreNum2;
    char op;
    TextView textViewObj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewObj = findViewById(R.id.textViewResult);
        textViewObj.setText("" + 0);
        soreNum = 0;

    }


    public void funcNumber(View view) {


        soreNum1 = Integer.parseInt((String) textViewObj.getText()) * 10;

        soreNum1 += Integer.parseInt((String) ((Button) view).getText());

        textViewObj.setText("" + soreNum1);

    }

    public void funcClearAll(View view) {
        soreNum1 = 0;
        textViewObj.setText("" + 0);
    }

    public void funcEq(View view) {


    }

    public void funcOP(View view) {
        op = (char) Integer.parseInt((String) ((Button) view).getText());
        textViewObj.setText("" + 0);
        switch (op) {
            case '+':
                soreNum1 += Integer.parseInt((String) ((Button) view).getText());
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + op);
        }


    }
}
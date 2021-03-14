package com.example.calculator;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int Num1, Num2;
    char op;
    TextView textViewResult;
    //SharedPreferences.Editor prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewResult = findViewById(R.id.textViewResult);

        textViewResult.setText("" + 0);
        Num1 = 0;
        Num2 = 0;

        Toast.makeText(this, "Go", Toast.LENGTH_SHORT).show();

    }

    //soreNum1
    public void funcNumber(View view) {

        //String result = textViewResult.getText().toString();
        Integer.parseInt((String) ((Button) view).getText());
        Num1 = Integer.parseInt((String) textViewResult.getText()) * 10;

        //Toast.makeText(this, ""+result, Toast.LENGTH_SHORT).show();

        if (Num1 == 0)
            textViewResult.setText("");

        textViewResult.append("" + Num1);

    }

    public void funcClearAll(View view) {
        Num1 = 0;
        Num2 = 0;
        textViewResult.setText("" + 0);
    }

    public void funcEq(View view) {

        //     switch (op) {
//            case '+':
//                soreNum1 += soreNum2;
//                break;
//            default:
//                throw new IllegalStateException("Unexpected value: " + op);
//        }
//        textViewObj.setText("" + soreNum1);
    }

    public void funcOP(View view) {

        textViewResult.append("\n");
        op = ((Button) view).getText().charAt(0);
        //Toast.makeText(this, "" + op, Toast.LENGTH_SHORT).show();


        textViewResult.append("" + op + "\n");


    }
}
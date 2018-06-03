package com.example.hasoo.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){

        EditText editText = findViewById(R.id.editText);
        EditText editText2= findViewById(R.id.editText2);

        double first = Double.parseDouble(editText.getText().toString());
        double second= Double.parseDouble(editText2.getText().toString());
        double result = 0;

        if(view.getId() == R.id.button) result = first + second;
        else if(view.getId() == R.id.button2) result = first - second;
        else if(view.getId() == R.id.button3) result = first * second;
        else result = first / second;

        String sResult = "계산 결과: " + result;

        TextView textView = findViewById(R.id.textView);
        textView.setText(sResult);
    }
}

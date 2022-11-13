package com.example.personalprojectmobilecourse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    private EditText number1text;
    private EditText number2text;
    private TextView sumview;
    private Button addButton;
    private Button subButton;
    private Button MulButton;
    private Button DivButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        number1text = findViewById(R.id.editTextNumber);
        number2text = findViewById(R.id.editTextNumber2);
        sumview = findViewById(R.id.resultTextView);
        addButton = findViewById(R.id.addBtn);
        subButton = findViewById(R.id.subBtn);
        MulButton = findViewById(R.id.mulBtn);
        DivButton = findViewById(R.id.divBtn);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (number1text.getText().toString().length() == 0) {
                    number1text.setText("0");
                }
                if (number2text.getText().toString().length() == 0) {
                    number2text.setText("0");
                }

                double num1 = Integer.parseInt(number1text.getText().toString());
                double num2 = Integer.parseInt(number2text.getText().toString());

                double result = num1 + num2;

                sumview.setText(String.valueOf(result));
            }
        });

        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (number1text.getText().toString().length() == 0) {
                    number1text.setText("0");
                }
                if (number2text.getText().toString().length() == 0) {
                    number2text.setText("0");
                }

                double num1 = Integer.parseInt(number1text.getText().toString());
                double num2 = Integer.parseInt(number2text.getText().toString());

                double result = num1 - num2;

                sumview.setText(String.valueOf(result));
            }
        });

        MulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (number1text.getText().toString().length() == 0) {
                    number1text.setText("0");
                }
                if (number2text.getText().toString().length() == 0) {
                    number2text.setText("0");
                }

                double num1 = Integer.parseInt(number1text.getText().toString());
                double num2 = Integer.parseInt(number2text.getText().toString());

                double result = num1 * num2;

                sumview.setText(String.valueOf(result));
            }
        });

        DivButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (number1text.getText().toString().length() == 0) {
                    number1text.setText("0");
                }
                if (number2text.getText().toString().length() == 0) {
                    number2text.setText("0");
                }

                double num1 = Integer.parseInt(number1text.getText().toString());
                double num2 = Integer.parseInt(number2text.getText().toString());

                if (num1 == 0 ) {
                    number1text.setText("1");
                    num1 = 1;
                }

                if (num2 == 0 ) {
                    number2text.setText("1");
                    num2 = 1;
                }

                double result = num1 / num2;

                sumview.setText(String.valueOf(result));
            }
        });

    }



}
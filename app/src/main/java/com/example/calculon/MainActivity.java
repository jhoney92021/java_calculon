package com.example.calculon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button; //TO USE BUTTON WIDGET
import android.widget.EditText;//TO USE EDIT TEXT
import android.view.View;//TO USE .VIEW

public class MainActivity extends AppCompatActivity {

    Button btn_1,
            btn_2,
            btn_3,
            btn_4,
            btn_5,
            btn_6,
            btn_7,
            btn_8,
            btn_9,
            btn_0,
            Addition,
            Subtract,
            Multiply,
            Divide,
            Result,
            Decimal,
            Clear;

    EditText Results;

    float Value1, Value2;

    boolean mAddition, mSubtract, mMultiplication, mDivision ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_0 = (Button) findViewById(R.id.btn_0);//VIEW FOR BUTTONS
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        Addition = (Button) findViewById(R.id.Addition);
        Subtract = (Button) findViewById(R.id.Subtract);
        Multiply = (Button) findViewById(R.id.Multiply);
        Divide = (Button) findViewById(R.id.Divide);
        Result = (Button) findViewById(R.id.Result);
        Decimal = (Button) findViewById(R.id.Decimal);
        Clear = (Button) findViewById(R.id.Clear);

        Results = (EditText) findViewById(R.id.Results);//VIEW FOR RESULTS

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Results.setText(Results.getText()+"0");
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Results.setText(Results.getText()+"1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Results.setText(Results.getText()+"2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Results.setText(Results.getText()+"3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Results.setText(Results.getText()+"4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Results.setText(Results.getText()+"5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Results.setText(Results.getText()+"6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Results.setText(Results.getText()+"7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Results.setText(Results.getText()+"8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Results.setText(Results.getText()+"9");
            }
        });

        Decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Results.setText(Results.getText()+".");
            }
        });

        Addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Float.parseFloat(Results.getText() + "");
                mAddition = true ;
                Results.setText(null);
            }
        });

        Subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Float.parseFloat(Results.getText() + "");
                mSubtract = true ;
                Results.setText(null);
            }
        });

        Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Float.parseFloat(Results.getText() + "");
                mMultiplication = true ;
                Results.setText(null);
            }
        });

        Divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Float.parseFloat(Results.getText() + "");
                mDivision = true ;
                Results.setText(null);
            }
        });

        Result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value2 = Float.parseFloat(Results.getText() + "");

                if (mAddition == true){
                    Results.setText(Value1 + Value2 +"");
                    mAddition=false;
                }

                if (mSubtract == true){
                    Results.setText(Value1 - Value2 +"");
                    mSubtract=false;
                }

                if (mMultiplication == true){
                    Results.setText(Value1 * Value2 +"");
                    mMultiplication=false;
                }

                if (mDivision == true){
                    Results.setText(Value1 / Value2 +"");
                    mDivision=false;
                }
            }
        });

        Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Results.setText("");
            }
        });

    }
}

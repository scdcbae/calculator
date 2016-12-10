package com.hanbit2007.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText etNum1, etNum2;
    Button btPlus, btMinus, btMulti, btDivide, btMod, btEqual;
    TextView tvResult;
    String sResult;
//    int nResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1 = (EditText) findViewById(R.id.etNum1);
        etNum2 = (EditText) findViewById(R.id.etNum2);

        btPlus = (Button) findViewById(R.id.btPlus);
        btMinus = (Button) findViewById(R.id.btMinus);
        btMulti = (Button) findViewById(R.id.btMulti);
        btDivide = (Button) findViewById(R.id.btDivide);
        btMod = (Button) findViewById(R.id.btMod);
        btEqual = (Button) findViewById(R.id.btEqual);

        tvResult = (TextView) findViewById(R.id.tvResult);

        btPlus.setOnClickListener(this);
        btMinus.setOnClickListener(this);
        btMulti.setOnClickListener(this);
        btDivide.setOnClickListener(this);
        btMod.setOnClickListener(this);
        btEqual.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int num1 = Integer.parseInt(String.valueOf(etNum1.getText()));
        int num2 = Integer.parseInt(etNum2.getText().toString());
        int nResult = 0;

        switch(v.getId()) {
            case R.id.btPlus:
                nResult = num1 + num2;
                tvResult.setText("RESULT(Plus): " + nResult);
                sResult = tvResult.getText().toString();
                break;
            case R.id.btMinus:
                nResult = num1 - num2;
                tvResult.setText("RESULT(Minus): " + nResult);
                sResult = tvResult.getText().toString();
                break;
            case R.id.btMulti:
                nResult = num1 * num2;
                tvResult.setText("RESULT(Multi): " + nResult);
                sResult = tvResult.getText().toString();
                break;
            case R.id.btDivide:
                nResult = num1 / num2;
                tvResult.setText("RESULT(Divide): " + nResult);
                sResult = tvResult.getText().toString();
                break;
            case R.id.btMod:
                nResult = num1 % num2;
                tvResult.setText("RESULT(Mod): " + nResult);
                sResult = tvResult.getText().toString();
                break;
            case R.id.btEqual:
                tvResult.setText(sResult);
                break;
        }
    }
}

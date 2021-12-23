package com.example.controlwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLoan = (Button) findViewById(R.id.button);
        Button btnDeposit = (Button) findViewById(R.id.button2);

        btnLoan.setOnClickListener(btnLoanListener);
        btnDeposit.setOnClickListener(btnDepositListener);
    }

    View.OnClickListener btnLoanListener = view -> {
        Intent intent = new Intent(this, LoanActivity.class);
        startActivity(intent);
    };

    View.OnClickListener btnDepositListener = view -> {
        Intent intent = new Intent(this, DepositActivity.class);
        startActivity(intent);
    };
}
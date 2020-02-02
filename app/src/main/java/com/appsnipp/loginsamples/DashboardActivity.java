package com.appsnipp.loginsamples;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {
    private Button mLogout;
    private TextView mName;
    private TextView mName1;
    private TextView mNumber;
    private TextView mTextEmail;
    private TextView mTextGender;
    private TextView mTextNegara;

    private String mNameString;
    private String mNumberString;
    private String mEmailString;
    private String mGenderString;
    private String mNegaraString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        mLogout = (Button) findViewById(R.id.btnLogout);
        mName = findViewById(R.id.text_username);
        mName1 = findViewById(R.id.text_username1);
        mNumber = findViewById(R.id.text_MobileNumber);
        mTextEmail = findViewById(R.id.text_email);
        mTextGender = findViewById(R.id.text_gender);
        mTextNegara = findViewById(R.id.text_negara);

        Intent intent = getIntent();
        mNameString = intent.getStringExtra(LoginActivity.NAME);
        mName.setText(mNameString);

        mNameString = intent.getStringExtra(LoginActivity.NAME);
        mName1.setText(mNameString);

        mNumberString = intent.getStringExtra(LoginActivity.NUMBER);
        mNumber.setText(mNumberString);

        mEmailString = intent.getStringExtra(LoginActivity.EMAIL);
        mTextEmail.setText(mEmailString);

        mGenderString = intent.getStringExtra(LoginActivity.GENDER);
        mTextGender.setText(mGenderString);

        mNegaraString = intent.getStringExtra(LoginActivity.NEGARA);
        mTextNegara.setText(mNegaraString);

        mLogout.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(DashboardActivity.this, Login.class);
        startActivity(intent);
    }
});


    }
}

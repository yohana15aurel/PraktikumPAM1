package com.appsnipp.loginsamples;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity  {

    private RadioGroup mGender;
    private RadioButton mSelectedGender;

    private EditText mUsername;
    private EditText mMobile;
    private EditText mEmail;
    private Button mRegister;
    private Spinner mNegara;

    private String mName;
    private String mName1;
    private String mNumber;
    private String mTextEmail;
    private String mTextGender;
    private String mTextNegara;

    public static final String NAME = "name";
    public static final String NUMBER = "number";
    public static final String EMAIL = "email";
    public static final String GENDER = "gender";
    public static final String NEGARA = "negara";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mRegister = (Button) findViewById(R.id.btnRegister);
        mUsername = findViewById(R.id.username);
        mMobile = findViewById(R.id.mobilenumber);
        mEmail = findViewById(R.id.email);
        mGender = findViewById(R.id.gender);
        mNegara = findViewById(R.id.negara);


        mRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId = mGender.getCheckedRadioButtonId();
                mSelectedGender = findViewById(selectedId);

                mTextNegara = mNegara.getSelectedItem().toString();

                mName = mUsername.getText().toString();
                mName1 = mUsername.getText().toString();
                mNumber = mMobile.getText().toString();
                mTextEmail = mEmail.getText().toString();
                mTextGender = mSelectedGender.getText().toString();

                Intent intent = new Intent(LoginActivity.this, DashboardActivity.class);
                intent.putExtra(NAME, mName);
                intent.putExtra(NUMBER, mNumber);
                intent.putExtra(EMAIL, mTextEmail);
                intent.putExtra(GENDER, mTextGender);
                intent.putExtra(NEGARA, mTextNegara);
                startActivity(intent);
            }
        });
    }
   

}

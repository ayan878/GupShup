package com.example.gupshup;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;


public class OTPActivity extends AppCompatActivity {
    ProgressBar progressBarVerify;
    Button btnGetOtp;
    Button VerifyBtn;
    private EditText Inputotp1, Inputotp2, Inputotp3, Inputotp4, Inputotp5, Inputotp6;
    private String verificationId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o_t_p);
        getSupportActionBar().hide();
        TextView phonenumber = findViewById(R.id.phonenumber);
        verificationId = getIntent().getStringExtra("verificationid");
        phonenumber.setText(String.format("+91-%s", getIntent().getStringExtra("mobile")));
        Inputotp1 = findViewById(R.id.Inputotp1);
        Inputotp2 = findViewById(R.id.Inputotp2);
        Inputotp3 = findViewById(R.id.Inputotp3);
        Inputotp4 = findViewById(R.id.Inputotp4);
        Inputotp5 = findViewById(R.id.Inputotp5);
        Inputotp6 = findViewById(R.id.Inputotp6);

        editTextInput();


        //tvMobile.setText(String.format(
        // "+91-%s", getIntent().getStringExtra("phone")
        //));

        // verificationId = getIntent().getStringExtra("verificationId");

               /* tvResendBtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                Toast.makeText(OTPActivity.this, "OTP Send Successfully.", Toast.LENGTH_SHORT).show();
                        }
                });*/
/*
                VerifyBtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                               progressBarVerify.setVisibility(View.VISIBLE);
                                btnGetOtp.setVisibility(View.INVISIBLE);
                                if (Inputotp1.getText().toString().trim().isEmpty() ||
                                        Inputotp2.getText().toString().trim().isEmpty() ||
                                        Inputotp3.getText().toString().trim().isEmpty() ||
                                        Inputotp4.getText().toString().trim().isEmpty() ||
                                        Inputotp5.getText().toString().trim().isEmpty() ||
                                        Inputotp6.getText().toString().trim().isEmpty()) {
                                        Toast.makeText(OTPActivity.this, "OTP is not Valid!", Toast.LENGTH_SHORT).show();
                                } else {
                                        if (verificationId != null) {
                                                String code = Inputotp1.getText().toString().trim() +
                                                        Inputotp2.getText().toString().trim() +
                                                        Inputotp3.getText().toString().trim() +
                                                        Inputotp4.getText().toString().trim() +
                                                        Inputotp5.getText().toString().trim() +
                                                        Inputotp6.getText().toString().trim();

                                              //  PhoneAuthCredential credential = PhoneAuthProvider.Inputotpredential(verificationId, code);
                                                PhoneAuthCredential credential = PhoneAuthProvider.getCredential(verificationId, code);
                                                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();

                                                firebaseAuth.signInWithCredential(credential)
                                                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                                                @Override
                                                                public void onComplete(@NonNull Task<AuthResult> task){
                                                              //  public void onComplete(@NonNull @NotNull Task<AuthResult> task) {
                                                                        if (task.isSuccessful()) {
                                                                                progressBarVerify.setVisibility(View.VISIBLE);
                                                                                VerifyBtn.setVisibility(View.INVISIBLE);
                                                                                Toast.makeText(OTPActivity.this, "Welcome...", Toast.LENGTH_SHORT).show();
                                                                                Intent intent = new Intent(OTPActivity.this, Login.class);
                                                                                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                                                                                startActivity(intent);
                                                                        } else {
                                                                                progressBarVerify.setVisibility(View.GONE);
                                                                                VerifyBtn.setVisibility(View.VISIBLE);
                                                                                Toast.makeText(OTPActivity.this, "OTP is not Valid!", Toast.LENGTH_SHORT).show();
                                                                        }
                                                                }
                                                        });
                                        }
                                }
                        }
                });
        }*/
    }

    private void editTextInput() {
        Inputotp1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Inputotp2.requestFocus();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        Inputotp2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Inputotp3.requestFocus();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        Inputotp3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Inputotp4.requestFocus();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        Inputotp4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Inputotp5.requestFocus();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        Inputotp5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Inputotp6.requestFocus();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

}
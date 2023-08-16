
package com.example.gupshup;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthOptions;
import com.google.firebase.auth.PhoneAuthProvider;
import java.util.concurrent.TimeUnit;


public class PhoneNumberActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private PhoneAuthProvider.OnVerificationStateChangedCallbacks mCallbacks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_number);
        getSupportActionBar().hide();
        EditText inputMobile = findViewById(R.id.inputMobile);
        Button btnGetOtp = findViewById(R.id.btnGetOtp);


        btnGetOtp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inputMobile.getText().toString().trim().isEmpty()) {
                    Toast.makeText(PhoneNumberActivity.this, "Enter Mobile", Toast.LENGTH_SHORT).show();
                    return;
                }
//                Intent intent = new Intent(getApplicationContext(), OTPActivity.class);
//                intent.putExtra("mobile", inputMobile.getText().toString());
//                startActivity(intent);
                PhoneAuthProvider.getInstance().verifyPhoneNumber(
                         "+91" + inputMobile,        // Phone number to verify
                        60,                 // Timeout duration
                        TimeUnit.SECONDS,   // Unit of timeout
                        PhoneNumberActivity.this,
                        new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
                            @Override
                            public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {

                            }

                            @Override
                            public void onVerificationFailed(@NonNull FirebaseException e) {
                                Toast.makeText(PhoneNumberActivity.this,e.getMessage(), Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onCodeSent(@NonNull String verificationid, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {

                                Intent intent = new Intent(getApplicationContext(), OTPActivity.class);
                                intent.putExtra("mobile", inputMobile.getText().toString());
                                intent.putExtra("verificationid", verificationid);
                                startActivity(intent);
                            }
                        }
                );
            }
        });



    }
}
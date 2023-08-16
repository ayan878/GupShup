package com.example.gupshup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity //implements View.OnClickListener {
    //Button BtnGetOtp;
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o_t_p);
        BtnGetOtp = findViewById(R.id.btnGetOtp);
        BtnGetOtp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnGetOtp:
                startActivity(new Intent(MainActivity.this, OTPActivity.class));
                break;

        }*/
    }
}
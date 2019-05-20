package com.example.market.view;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import com.example.market.MapsActivity;
import com.example.market.R;
import com.google.android.gms.maps.MapFragment;

public class SignupActivity extends AppCompatActivity {
    private EditText firstnametxt, lastnametxt, usernametxt, passtxt, confirmpasstxt;
    private Button submitbtn, adresbtn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_layout);

        firstnametxt = findViewById(R.id.user_firstname_signup);
        lastnametxt = findViewById(R.id.user_lastname_signup);
        usernametxt = findViewById(R.id.user_username_signup);
        passtxt = findViewById(R.id.pass_user_signup);
        confirmpasstxt = findViewById(R.id.confirmpass_user_signup);
        submitbtn = findViewById(R.id.user_submit_signup);
        adresbtn = findViewById(R.id.user_adres_signup);
        adresbtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, MapsActivity.class);
            startActivity(intent);
        });
        MapFragment mapFragment = MapFragment.newInstance();
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.)


    }
}

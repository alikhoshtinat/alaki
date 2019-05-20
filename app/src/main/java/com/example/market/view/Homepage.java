package com.example.market.view;

import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.example.market.R;
import com.example.market.model.User;
import com.example.market.modelview.DatabaseAccess;

public class Homepage extends AppCompatActivity {
    TextView aa;
    private static User user;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage_layout);
        user = LoginActivity.getUser();
        Toast.makeText(this, user.getFirstname()+ " " + user.getLastname() + " خوش آمدید!" , Toast.LENGTH_LONG).show();
    }
}

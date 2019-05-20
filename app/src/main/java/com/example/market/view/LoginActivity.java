package com.example.market.view;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.market.R;
import com.example.market.model.User;
import com.example.market.modelview.DatabaseAccess;

public class LoginActivity extends AppCompatActivity {
    EditText usertxt;
    EditText passtxt;
    Button loginbtn;
    private static User user;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        usertxt = findViewById(R.id.username_login_edittext);
        passtxt = findViewById(R.id.password_login_edittext);
        loginbtn = findViewById(R.id.login_btn);
        loginbtn.setOnClickListener(v -> {
            String username = usertxt.getText().toString();
            String pass = passtxt.getText().toString();
            DatabaseAccess databaseAccess = new DatabaseAccess(this);
            Cursor c = databaseAccess.getDb().rawQuery("SELECT * FROM Users Where username = ? And password = ?", new String[]{username, pass});
            c.moveToFirst();
            if (c.isAfterLast()) {
                Toast.makeText(this, "نام کاربری یا رمز عبور اشتباه است!", Toast.LENGTH_LONG).show();
            }else {
                user = new User(c.getInt(0), c.getString(1), c.getString(2), c.getString(3), c.getString(4), c.getString(5));
                Intent intent = new Intent(this, Homepage.class);
                startActivity(intent);
                this.onStop();
            }

        });
    }

    public static User getUser() {

        return user;
    }

    public static void setUser(User user) {
        LoginActivity.user = user;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}

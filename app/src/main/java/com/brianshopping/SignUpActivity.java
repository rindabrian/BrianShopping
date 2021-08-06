package com.brianshopping;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {
    private CheckBox checkBox;
    private EditText username, password;
    private AppCompatButton signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        checkBox = findViewById(R.id.accept);
        signUpButton = findViewById(R.id.signBtnSignUp);
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Creating Account", Toast.LENGTH_LONG).show();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(getApplicationContext(), "Account Created Successfully", Toast.LENGTH_LONG).show();
                    }
                }, 2000);

                Handler handler2 = new Handler();
                handler2.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                       // Toast.makeText(getApplicationContext(), "Account Created Successfully",Toast.LENGTH_LONG).show();
                    }
                },2000);
            }
        });
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (checkBox.isChecked()) {
                    signUpButton.setEnabled(true);
                    signUpButton.setVisibility(View.VISIBLE);
                    signUpButton.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_bg));
                }
                if (!checkBox.isChecked()) {
                    signUpButton.setEnabled(false);
                    signUpButton.setVisibility(View.GONE);
                }
            }
        });
    }
}
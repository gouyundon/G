package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Check extends AppCompatActivity {
    private EditText mpassword;
    private EditText maccount;
    private Button mcheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);


        SharedPreferences sp = getSharedPreferences("check", Context.MODE_PRIVATE);
        SharedPreferences.Editor eit = sp.edit();
        maccount = findViewById(R.id.editText3);
        mpassword = findViewById(R.id.editText4);
        mcheck = findViewById(R.id.btn_check);

        mcheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = maccount.getText().toString().trim();
                String password = mpassword.getText().toString().trim();
                eit.putString("account", name);
                eit.putString("password", password);
                eit.apply();
                Toast.makeText(Check.this, "注册成功", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Check.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }

}
//
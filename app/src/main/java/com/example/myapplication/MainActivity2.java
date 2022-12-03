package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private Button mbtnlogin;
    private EditText mpassword;
    private EditText maccount;
    private TextView mzhuche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initview();
        mzhuche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, Check.class);
                startActivity(intent);
            }
        });
        mbtnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
    }

    private void initview() {
        mbtnlogin = findViewById(R.id.btn_trans2);
        maccount = findViewById(R.id.editText);
        mpassword = findViewById(R.id.editText2);
        mzhuche = findViewById(R.id.zhuche);
    }

    private void login() {
        try {
            String account = maccount.getText().toString();
            String password = mpassword.getText().toString();
            String account1 = getSharedPreferences("check", Context.MODE_PRIVATE).getString("account", null);
            String password1 = getSharedPreferences("check", Context.MODE_PRIVATE).getString("password", null);

            if (!password.equals("") && !account.equals("")) {
                if (account1.equals(account) && password1.equals(password)) {
                    Toast.makeText(MainActivity2.this, "登陆成功", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity2.this, "登录失败", Toast.LENGTH_LONG).show();
                }
            }


        }

        catch (Exception e){
            e.printStackTrace();
        }

    }
}
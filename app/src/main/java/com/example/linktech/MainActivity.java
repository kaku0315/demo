package com.example.linktech;

import androidx.appcompat.app.AppCompatActivity;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.Statement;
import org.postgresql.Driver;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText mTextUsername;
    EditText mTextPassword;
    Button mButtonLogin;
    TextView mTextViewPorF;



    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextUsername = (EditText)findViewById(R.id.edittext_username);
        mTextPassword = (EditText)findViewById(R.id.edittext_password);
        mButtonLogin = (Button)findViewById(R.id.button_login);
        mTextViewPorF = (TextView)findViewById(R.id.textview_register);
        mButtonLogin.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = mTextUsername.getText().toString();
                String password = mTextPassword.getText().toString();
                String sql = null;
                Connection con = null;
                Statement st = null;


                if(username.equals("linktech")==true){
                    if(password.equals("linktech")==true){
                        mTextViewPorF.setText("Incorrect PassWord");
                    }
                    else{
                        mTextViewPorF.setText("Incorrect PassWord");
                    }
                }
                else{
                    mTextViewPorF.setText("Incorrect UserName");
                }
            }
        });
    }
}

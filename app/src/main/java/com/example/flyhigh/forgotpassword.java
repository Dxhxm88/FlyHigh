package com.example.flyhigh;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class forgotpassword extends AppCompatActivity {

    private EditText forgotpassword;
    private Button passwordrecoverbtn;
    private TextView gobackloginbtn;

    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpassword);

        forgotpassword = findViewById(R.id.forgotpassword);
        passwordrecoverbtn = findViewById(R.id.btnForgot);
        gobackloginbtn = findViewById(R.id.btnGobacklogin);

        firebaseAuth = FirebaseAuth.getInstance();

        gobackloginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.example.flyhigh.forgotpassword.this, activity_login.class );
                startActivity(intent);
            }
        });

        passwordrecoverbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = forgotpassword.getText().toString().trim();

                if (email.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Enter your email", Toast.LENGTH_SHORT).show();
                }else{
                    firebaseAuth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if (task.isSuccessful()){
                                Toast.makeText(getApplicationContext(), "Recovery password email sent", Toast.LENGTH_SHORT).show();
                                finish();
                                startActivity(new Intent(com.example.flyhigh.forgotpassword.this, activity_login.class));
                            }else{
                                Toast.makeText(getApplicationContext(), "Email not existed", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });
    }
}
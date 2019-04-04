package com.example.pizza_loop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class loginActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        button = findViewById(R.id.sign_up);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openlogin();
            }
        });

    }

    public void openlogin(){
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }
}

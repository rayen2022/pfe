package com.example.myapplication2.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication2.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText ET_login = findViewById(R.id.Login);
        final EditText ET_Pass = findViewById(R.id.Password);
        final Button btn_Envoyer = findViewById(R.id.button);

        btn_Envoyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // par exemple login = "admin" et mot de passe = "test"
                if(ET_login.getText().toString().equals("admin@admin.com") && ET_Pass.getText().toString().equals("test"))
                {
                    // il faut tout dabor crier l'activite HomeActivity
                    Intent i = new Intent(MainActivity.this, HomeActivity.class);

                    // bundle eli 7atina fih login w mot de pass
                    Bundle b = new Bundle();
                    b.putString("login", ET_login.getText().toString());
                    b.putString("pass", ET_Pass.getText().toString());

                    // hne affectina el bundel lel intent eli howwa bech yemchi m MainActivity lel HomeActivity
                    i.putExtras(b);

                    // start
                    startActivity(i);
                }
                else
                {
                    ET_login.setError("Login Error");
                    ET_Pass.setError("Password Error");
                }
            }
        });

    }
}

package com.example.salexxapp;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class Login extends AppCompatActivity {

    Button btnLogin,btn_registrarse;
    EditText edtUsuario, edtPassword;
    FirebaseAuth mAucth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAucth=FirebaseAuth.getInstance();
        edtUsuario=findViewById(R.id.edtUsuario);
        edtPassword=findViewById(R.id.edtPassword);
        //btn para logiar
        btnLogin=findViewById(R.id.btnLogin);

//btn para registrarse
        btn_registrarse=findViewById(R.id.btn_registrarse);
        //btn_registrarse
        btn_registrarse=(Button)findViewById(R.id.btn_registrarse);
        btn_registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_21Q = new Intent(Login.this, Insertar.class);
                startActivity(btn_21Q);
            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario = edtUsuario.getText().toString().trim();
                String password = edtPassword.getText().toString().trim();

                if (usuario.isEmpty() && password.isEmpty()) {
                    Toast.makeText(Login.this, "Ingresar los Datos", Toast.LENGTH_SHORT).show();
                }else{
                loginUser(usuario, password);
            }
        }

        });

    }

    private void loginUser(String usuario, String password) {
        mAucth.signInWithEmailAndPassword(usuario,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    //finish();
                    if(mAucth.getCurrentUser().isEmailVerified()){
                        startActivity(new Intent(Login.this, MainActivity.class));
                        Toast.makeText(Login.this, "Bienvenido", Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(Login.this, "Por favor verificar Correo", Toast.LENGTH_SHORT).show();
                    }

                }else {
                    Toast.makeText(Login.this, "Error", Toast.LENGTH_SHORT).show();
                }

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(Login.this, "Error al iniciar Sesión", Toast.LENGTH_SHORT).show();

            }
        });
    }
}

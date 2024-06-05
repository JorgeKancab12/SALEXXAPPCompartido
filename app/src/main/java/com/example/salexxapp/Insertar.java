package com.example.salexxapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.common.api.internal.RegisterListenerMethod;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.auth.User;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class


Insertar extends AppCompatActivity {
    EditText et_name, et_Email, et_Password, et_Password2;
    Button btn_register;
    FirebaseAuth mAuth;
    FirebaseFirestore nFirestore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insertar);

        et_name = findViewById(R.id.et_name);
        et_Email = findViewById(R.id.et_Email);
        et_Password = findViewById(R.id.et_Password);
        et_Password2 = findViewById(R.id.et_Password2);
        btn_register = findViewById(R.id.btn_register);
        mAuth = FirebaseAuth.getInstance();
        nFirestore = FirebaseFirestore.getInstance();

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                register();
            }
        });
    }

    private void register() {
        String name = et_name.getText().toString();
        String email = et_Email.getText().toString();
        String password = et_Password.getText().toString();
        String password2 = et_Password2.getText().toString();

        if (!name.isEmpty() && !email.isEmpty() && !password.isEmpty() && !password2.isEmpty()) {

            if (isEmailValid(email)) {
                if (password.equals(password2)){
                    if (password.length() >= 6){
                        createUser(name, email, password);
                    }
                    else{
                        Toast.makeText(Insertar.this, "La contraseña debe tener almenos 6 Caracteres", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(Insertar.this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show();

                }
            }
            else{
                Toast.makeText(Insertar.this, "El correo no es valido", Toast.LENGTH_SHORT).show();
            }
        }
        else {
            Toast.makeText(Insertar.this, "Para continuar inserte Todos los campos", Toast.LENGTH_SHORT).show();
        }
    }

    private void createUser(String name, String email, String password) {
        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
            if (task.isSuccessful()){

                String id = mAuth.getCurrentUser().getUid();
                Map<String, Object> map = new HashMap<>();
                map.put("name", name);
                map.put("email", email);
                map.put("password", password);
                nFirestore.collection("Users_SALEXX").document(id).set(map).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()){

                            Intent i = new Intent(Insertar.this, Login.class );
                            startActivity(i);
                            mAuth.getCurrentUser().sendEmailVerification().addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                  if(task.isSuccessful()){
                                      Toast.makeText(Insertar.this, "El Usuario se Registró Correctamente", Toast.LENGTH_SHORT).show();
                                  }
                                  else {
                                      Toast.makeText(Insertar.this, "NO se pudo registrar el Usuario... Intente de Nuevo", Toast.LENGTH_SHORT).show();
                                  }
                                }
                            });

                        }
                    }
                });
            }
            else {
                Toast.makeText(Insertar.this, "NO se pudo registrar el Usuario... Intente de Nuevo", Toast.LENGTH_SHORT).show();
            }
            }
        });

    }

    public boolean isEmailValid(String email) {
        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
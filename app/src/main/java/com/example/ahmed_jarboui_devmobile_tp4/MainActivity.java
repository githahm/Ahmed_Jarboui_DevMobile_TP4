package com.example.ahmed_jarboui_devmobile_tp4;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editNom, editPrenom, editMail;
    Button btnEnvoyer;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        // Association des composants XML à leurs équivalents Java
        editNom = findViewById(R.id.editNom);
        editPrenom = findViewById(R.id.editPrenom);
        editMail = findViewById(R.id.editEmail);
        btnEnvoyer = findViewById(R.id.btnEnvoyer);

        //  Gestion du clic sur le bouton Envoyer
        btnEnvoyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Récupération des valeurs saisies
                String nom = editNom.getText().toString();
                String prenom = editPrenom.getText().toString();
                String mail = editMail.getText().toString();

                //  Création de l’intent explicite
                Intent myIntent = new Intent(MainActivity.this, WelcomeActivity.class);

                // Transfert des données via putExtra()
                myIntent.putExtra("name", nom);
                myIntent.putExtra("lastname", prenom);
                myIntent.putExtra("mymail", mail);

                // Lancement de la deuxième activité
                startActivity(myIntent);
            }
        });
    }
}



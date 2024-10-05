package com.example.pizza;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import pizza.asmae.ma.pizzarecipes.classes.Produit;

public class PizzaRecipe extends AppCompatActivity {

    private ImageView pizzaImageView;
    private TextView pizzaNameTextView;
    private TextView pizzaDescriptionTextView;
    private TextView pizzaIngredientsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_recipe);

        // Initialiser les vues
        pizzaImageView = findViewById(R.id.imagepizza);
        pizzaNameTextView = findViewById(R.id.nompizza);
        pizzaDescriptionTextView = findViewById(R.id.tv1);
        pizzaIngredientsTextView = findViewById(R.id.tv2);

        // Récupérer la pizza passée dans l'intent
        Produit selectedPizza = (Produit) getIntent().getSerializableExtra("selectedPizza");

        // Mettre à jour les vues avec les informations de la pizza
        if (selectedPizza != null) {
            pizzaImageView.setImageResource(selectedPizza.getPhoto());
            pizzaNameTextView.setText(selectedPizza.getNom());
            pizzaDescriptionTextView.setText(selectedPizza.getDescription());
            pizzaIngredientsTextView.setText(selectedPizza.getDetaisingred());
        }
    }
}

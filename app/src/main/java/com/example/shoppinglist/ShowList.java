package com.example.shoppinglist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ShowList extends AppCompatActivity {
    private ArrayList<String> shoppingListItems;
    private Button backButton;
    private TextView shoppingList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        // Getting the intent and array from MainActivity
        Intent intent = getIntent();
        this.shoppingListItems = intent.getStringArrayListExtra(MainActivity.EXTRA_MESSAGE);
        this.shoppingList = findViewById(R.id.shoppingList);
        this.shoppingList.setText(shoppingListText(shoppingListItems));

        // Backbutton
        this.backButton = findViewById(R.id.button_back);
        this.backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }

    private String shoppingListText(ArrayList<String> x) {
        String listOfItems = "";
        for (String item : x) {
            listOfItems = listOfItems + item + "\n\r";
        }
        return listOfItems;
    }
}

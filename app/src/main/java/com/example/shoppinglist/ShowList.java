package com.example.shoppinglist;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ShowList extends AppCompatActivity {
    private ArrayList<String> shoppingListItems;
    private Button backButton;
    private TextView shoppingList;
    private AlertDialog.Builder alertDialog;

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
                //onBackPressed();
                alertDialog.show();
            }
        });

        // AlertDialog
        alertDialog = new AlertDialog.Builder(this)
                .setTitle("Go back")
                .setMessage("Do you really want to go back?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .setNegativeButton(android.R.string.no, null)
                .setIcon(android.R.drawable.ic_dialog_alert);

    }

    // Convert ArrayList to String and format the output.
    private String shoppingListText(ArrayList<String> x) {
        String listOfItems = "";
        for (String item : x) {
            listOfItems = listOfItems + " - " + item + "\n";
        }
        return listOfItems;
    }
}

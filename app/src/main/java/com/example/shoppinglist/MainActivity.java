package com.example.shoppinglist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button button_save;
    private Button button_done;
    private ArrayList<String> shoppingList = new ArrayList<>();
    private EditText textViewContent;
    public static final String EXTRA_MESSAGE = "com.example.shoppinglist.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.button_save = findViewById(R.id.button_save);
        this.button_done = findViewById(R.id.button_done);
        this.textViewContent = findViewById(R.id.editText);
        this.button_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveText(textViewContent);
            }
        });
        this.button_done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showShoppingList(v);
            }
        });
    }

    // Add the item to the list IF the length is correct.
    private void saveText(EditText x) {
        String item = x.getText().toString();
        if (item.length() > 15) {
            Toast.makeText(this, "Text is too long (max 15 letters)", Toast.LENGTH_LONG).show();
        } else if (item.length() < 3) {
            Toast.makeText(this, "Text is too short (min 3 letters)", Toast.LENGTH_LONG).show();
        } else {
            shoppingList.add(item);
            x.setText("");
            Toast.makeText(this, "Item added!", Toast.LENGTH_SHORT).show();
        }
    }

    // Opens a new Activity to show all the items the user has listed.
    public void showShoppingList(View view) {
        Intent intent = new Intent(this, ShowList.class);
        intent.putExtra(EXTRA_MESSAGE, shoppingList);
        startActivity(intent);
    }

}

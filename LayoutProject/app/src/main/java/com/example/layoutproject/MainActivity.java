package com.example.layoutproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.layoutproject.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Button btnWeb = (Button) binding.btnWeb;
        Button btnFrame = (Button) binding.btnFrame;

        EditText nombre = (EditText)binding.editText1;
        Spinner spinner = (Spinner)binding.spinner1;


        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,WebJaveriana.class);
                startActivity(intent);
            }
        });

        btnFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, FrameInfo.class);
                Bundle bundle = new Bundle();
                bundle.putString("Nombre", nombre.getText().toString());
                bundle.putString("Nivel", (String) spinner.getSelectedItem());
                intent.putExtra("bundle",bundle);
                startActivity(intent);
            }
        });


    }
}
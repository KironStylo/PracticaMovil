package com.example.layoutproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.layoutproject.databinding.ActivityFrameInfoBinding;

public class FrameInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityFrameInfoBinding binding = ActivityFrameInfoBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        Bundle bundle = getIntent().getBundleExtra("bundle");
        String nombre = bundle.getString("Nombre");
        String nivel = bundle.getString("Nivel");

        TextView txtNombre = (TextView) binding.textView;
        TextView txtNivel = (TextView) binding.textView2;

        txtNombre.setText(nombre);
        txtNivel.setText(nivel);
    }
}
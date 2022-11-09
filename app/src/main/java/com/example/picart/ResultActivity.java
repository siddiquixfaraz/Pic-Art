package com.example.picart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.picart.databinding.ActivityMainBinding;
import com.example.picart.databinding.ActivityResultBinding;

public class ResultActivity extends AppCompatActivity {

    ActivityResultBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityResultBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.resultimg.setImageURI(getIntent().getData());


    }
}
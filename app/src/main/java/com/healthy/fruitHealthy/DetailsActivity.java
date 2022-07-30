package com.healthy.fruitHealthy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.healthy.fruitHealthy.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {
    private ActivityDetailsBinding binding ;
    private Fruit fruit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_details);
        Intent intent = getIntent();
        fruit = (Fruit) intent.getSerializableExtra("fruit");
        int hinhAnh = fruit.getImage();
        String name = fruit.getName();
        binding.txtNameDetails.setText(name);
        Glide.with(this).load(hinhAnh).into(binding.imgDetails);
        binding.btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DetailsActivity.this,HealthyActivity.class));
            }
        });
        binding.btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DetailsActivity.this, "Next Activity OnSuccessfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
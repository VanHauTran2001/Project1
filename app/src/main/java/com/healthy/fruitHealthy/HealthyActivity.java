package com.healthy.fruitHealthy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.healthy.fruitHealthy.databinding.ActivityHealthyBinding;

import java.util.ArrayList;
import java.util.List;

public class HealthyActivity extends AppCompatActivity {
    private ActivityHealthyBinding binding;
    private List<Fruit> fruitList;
    private AdapterHealthy adapterHealthy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_healthy);
        //anhxa
        binding.imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        intRecylerView();
    }

    private void intRecylerView() {
        fruitList = new ArrayList<>();
        fruitList.add(new Fruit("Watermelon","Watermelon has high water content and also provides some fiber",30,1,R.drawable.watermelon));
        fruitList.add(new Fruit("Banana","Banana has high water content and also provides some fiber",150,1,R.drawable.bananas));
        fruitList.add(new Fruit("Strawberry","Strawberry has high water content and also provides some fiber",80,1,R.drawable.strawberry));
        fruitList.add(new Fruit("Orange","Orange has high water content and also provides some fiber",60,1,R.drawable.orange));
        fruitList.add(new Fruit("Cherry","Cherry has high water content and also provides some fiber",180,1,R.drawable.cherries));
        fruitList.add(new Fruit("Apple","Apple has high water content and also provides some fiber",260,1,R.drawable.apple));
        adapterHealthy = new AdapterHealthy(this,fruitList);
        binding.recylerFruit.setLayoutManager(new GridLayoutManager(this,2));
        binding.recylerFruit.setAdapter(adapterHealthy);
    }
}
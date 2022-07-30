package com.healthy.fruitHealthy;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.healthy.fruitHealthy.databinding.ItemFruitBinding;

import java.util.List;

public class AdapterHealthy extends RecyclerView.Adapter<AdapterHealthy.HealthyViewHolder>{
    private Context context;
    private List<Fruit> fruitList;
    private ItemFruitBinding binding;

    public AdapterHealthy(Context context, List<Fruit> fruitList) {
        this.context = context;
        this.fruitList = fruitList;
    }

    @NonNull
    @Override
    public HealthyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(context).inflate(R.layout.item_fruit,parent,false);
        binding = DataBindingUtil.bind(view);
        return new HealthyViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull HealthyViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Fruit fruit = fruitList.get(position);
        binding.txtName.setText(fruit.getName());
        binding.txtDescription.setText(fruit.getDecription());
        binding.txtPrice.setText(fruit.getPrice()+"$");
        binding.txtUnit.setText(fruit.getUnit()+" KG ");
        Glide.with(context).load(fruit.getImage()).into(binding.imgRecently);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,DetailsActivity.class);
                intent.putExtra("fruit",fruitList.get(position));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return fruitList.size();
    }

    public class HealthyViewHolder extends RecyclerView.ViewHolder{
        public HealthyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}

package com.ekosp.horizontalrecycleview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Grocery> groceryList = new ArrayList<>();
    private RecyclerView groceryRecyclerView;
    private RecyclerViewHorizontalListAdapter groceryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        groceryRecyclerView = findViewById(R.id.idRecyclerViewHorizontalList);
        // add a divider after each item for more clarity
        groceryRecyclerView.addItemDecoration(new DividerItemDecoration(MainActivity.this, LinearLayoutManager.HORIZONTAL));
        groceryAdapter = new RecyclerViewHorizontalListAdapter(groceryList, getApplicationContext());

        // LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        LinearLayoutManager horizontalLayoutManager =
                new GridLayoutManager(MainActivity.this, 2, GridLayoutManager.HORIZONTAL, false);

        groceryRecyclerView.setLayoutManager(horizontalLayoutManager);
        groceryRecyclerView.setAdapter(groceryAdapter);
        populategroceryList();
    }

    private void populategroceryList(){
        Grocery potato = new Grocery("Potato", R.mipmap.ic_launcher);
        Grocery onion = new Grocery("Onion", R.mipmap.ic_launcher);
        Grocery cabbage = new Grocery("Cabbage", R.mipmap.ic_launcher);
        Grocery cauliflower = new Grocery("Cauliflower", R.mipmap.ic_launcher);

        for(int i=0; i<6; i++){
            groceryList.add(potato);
            groceryList.add(onion);
        }

        groceryList.add(cabbage);
        groceryList.add(cauliflower);
        groceryAdapter.notifyDataSetChanged();
    }
}
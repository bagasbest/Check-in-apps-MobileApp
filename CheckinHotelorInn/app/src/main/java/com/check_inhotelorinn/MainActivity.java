package com.check_inhotelorinn;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private ArrayList<Hotel_Constructor> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.rv_hotel);
        rv.setHasFixedSize(true);

        ActionBar a = getSupportActionBar();
        a.setTitle("Daftar Hotel Favorit");

        list.addAll(Hotel_Data.getListData());
        showRecyclerView();
    }

    private void showRecyclerView() {
        rv.setLayoutManager(new LinearLayoutManager(this));
        Hotel_ListAdapter hc = new Hotel_ListAdapter(list);
        rv.setAdapter(hc);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.item_person, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int itemId) {
        switch (itemId) {
            case R.id.ic_person:
                Intent i = new Intent(this, myProfile.class);
                startActivity(i);
                break;
        }

    }
}

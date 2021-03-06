package com.check_inhotelorinn;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {

    ImageView img;
    TextView tv_name, tv_detail, tv_harga;

    Button btPesan, btWhislist, btChat;

    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_DETAIL = "extra_detail";
    public static final String EXTRA_FOTO = "extra_foto";
    public  static  final String EXTRA_HARGA = "extra_harga";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final String name = getIntent().getStringExtra(EXTRA_NAME);
        String detail = getIntent().getStringExtra(EXTRA_DETAIL);
        String harga = getIntent().getStringExtra(EXTRA_HARGA);

        setContentView(R.layout.activity_detail);


        ActionBar a = getSupportActionBar();
        a.setTitle(name);

         img = findViewById(R.id.img_item_foto);
        tv_name = findViewById(R.id.tv_hotelName);
        tv_detail = findViewById(R.id.tv_hotelDetail);
        tv_harga = findViewById(R.id.tv_hargaHotel);

        btChat = findViewById(R.id.bt_chat);
        btPesan = findViewById(R.id.bt_pesan);
        btWhislist = findViewById(R.id.bt_whistlist);

        Glide.with(this)
                .load(getIntent().getIntExtra(EXTRA_FOTO,0))

                .into(img);
        tv_name.setText(name);
        tv_detail.setText(detail);
        tv_harga.setText(harga);

        btPesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Kamu Memesan " + name, Toast.LENGTH_SHORT).show();
            }
        });

        btChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent i = new Intent(DetailActivity.this, Custom_View.class);
                 startActivity(i);
            }
        });

        btWhislist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), name + " ditambahkan ke Whistlist ", Toast.LENGTH_SHORT).show();
            }
        });


    }


}

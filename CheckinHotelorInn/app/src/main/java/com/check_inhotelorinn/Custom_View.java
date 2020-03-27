package com.check_inhotelorinn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Custom_View extends AppCompatActivity {

    private EditText etMasuk;
    private Button btnMauk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom__view);

        etMasuk = findViewById(R.id.tv_masuk);
        btnMauk = findViewById(R.id.my_button);

        setMyButtonEnable();

        etMasuk.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                setMyButtonEnable();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        btnMauk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Custom_View.this, etMasuk.getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }



    private void setMyButtonEnable() {
        Editable hasil = etMasuk.getText();
        if(hasil != null && !hasil.toString().isEmpty()){
            btnMauk.setEnabled(true);
        }else{
            btnMauk.setEnabled(false);
        }
    }


}

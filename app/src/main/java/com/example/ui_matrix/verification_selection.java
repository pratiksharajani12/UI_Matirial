package com.example.ui_matrix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class verification_selection extends AppCompatActivity {

    private ImageView phone_icn,code_icn,image_icn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification_selection);

        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this,R.color.dblue));

        binding();

        phone_icn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(verification_selection.this , phone_verification.class);
                startActivity(intent);
            }
        });
        code_icn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(verification_selection.this , code_verificatiion.class);
                startActivity(intent);
            }
        });
        image_icn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(verification_selection.this , image_verification.class);
                startActivity(intent);
            }
        });


    }
    private void binding(){
        phone_icn = (ImageView) findViewById(R.id.phone_icn);
        code_icn = (ImageView) findViewById(R.id.code_icn);
        image_icn = (ImageView) findViewById(R.id.image_icn);
    }
}
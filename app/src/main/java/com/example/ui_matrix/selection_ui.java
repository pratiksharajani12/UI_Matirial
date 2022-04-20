package com.example.ui_matrix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class selection_ui extends AppCompatActivity {

    private ImageView form_icn,profile_icn,check_icn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_ui);
        binding();

        Window window = getWindow();

        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

        window.setStatusBarColor(ContextCompat.getColor(this,R.color.dblue));

        form_icn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(selection_ui.this , form_select.class);
                startActivity(intent);
            }
        });

        profile_icn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(selection_ui.this , profile_selection.class);
                startActivity(intent);
            }
        });
        check_icn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(selection_ui.this , verification_selection.class);
                startActivity(intent);
            }
        });
    }

    private void binding(){
        form_icn = (ImageView) findViewById(R.id.form_icn);
        profile_icn = (ImageView) findViewById(R.id.profile_icn);
        check_icn = (ImageView) findViewById(R.id.check_icn);
    }
}
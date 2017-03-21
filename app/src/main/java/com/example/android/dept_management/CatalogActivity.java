package com.example.android.dept_management;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CatalogActivity extends AppCompatActivity {
    public Button Btn_tch;
    public void init(){
        Btn_tch=(Button)findViewById(R.id.Btn_tch);
        Btn_tch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj3=new Intent(CatalogActivity.this,Teacher_Detail.class);
                startActivity(obj3);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog);
        init();
    }
}

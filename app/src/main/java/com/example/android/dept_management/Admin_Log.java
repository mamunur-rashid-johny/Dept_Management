package com.example.android.dept_management;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Admin_Log extends AppCompatActivity {
    public Button Log_btn;
    public void init(){
        Log_btn=(Button)findViewById(R.id.Log_btn);
        Log_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj2=new Intent(Admin_Log.this,CatalogActivity.class);
                startActivity(obj2);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin__log);
        init();
    }
}

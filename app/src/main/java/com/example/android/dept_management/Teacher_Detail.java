package com.example.android.dept_management;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Teacher_Detail extends AppCompatActivity {
    TeacherInfo myDb;
    EditText editText2,editText3,editText4,editText5,editText6,editText7;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher__detail);
        myDb=new TeacherInfo(this);
        editText2=(EditText)findViewById(R.id.editText2);
        editText3=(EditText)findViewById(R.id.editText3);
        editText4=(EditText)findViewById(R.id.editText4);
        editText5=(EditText)findViewById(R.id.editText5);
        editText6=(EditText)findViewById(R.id.editText6);
        editText7=(EditText)findViewById(R.id.editText7);
        button=(Button)findViewById(R.id.button);
        addData();

    }
    public void addData(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isinsert=myDb.insertData( editText2.getText().toString(),editText3.getText().toString(),
                        editText4.getText().toString(),editText5.getText().toString(),editText6.getText().toString(),
                        editText7.getText().toString());
            if(isinsert==true)
                Toast.makeText(Teacher_Detail.this,"Data inserted",Toast.LENGTH_LONG).show();
                else
                Toast.makeText(Teacher_Detail.this,"Data is not inserted",Toast.LENGTH_LONG).show();

            }
        });
    }
}

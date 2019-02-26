package com.example.myapplicationdb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.sql.DatabaseMetaData;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

        EditText name,age;
        Button add, list;

        DatabaseManager myDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDB=new DatabaseManager(this);
                name=(EditText)findViewById(R.id.name);
                age=(EditText)findViewById(R.id.age);
    }
}

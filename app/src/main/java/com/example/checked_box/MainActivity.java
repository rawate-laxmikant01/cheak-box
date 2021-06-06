package com.example.checked_box;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox r,l;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r=findViewById(R.id.right_id);
        l=findViewById(R.id.left_id);

    }

    public void nextMethod(View view) {
        if(r.isChecked()){
            Toast.makeText(this, "r is checked", Toast.LENGTH_SHORT).show();
        }
        if(l.isChecked()){
            Toast.makeText(this, "l is checked", Toast.LENGTH_SHORT).show();
        }
    }
}
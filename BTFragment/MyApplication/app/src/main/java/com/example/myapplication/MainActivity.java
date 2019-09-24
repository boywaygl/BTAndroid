package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edta,edtmain,edtb;
    Button btnmain,btna,btnb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edta = findViewById(R.id.edta);
        edtb = findViewById(R.id.edtb);
        edtmain = findViewById(R.id.edtmain);
        btnmain = findViewById(R.id.btnmain);
        btna = findViewById(R.id.btna);
        btnb = findViewById(R.id.btnb);
        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String content = edta.getText().toString();
                edtb.setText(content);
            }
        });
    }
}

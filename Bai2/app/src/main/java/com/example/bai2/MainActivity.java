package com.example.bai2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    private Button btnF,btnC,btnClear;
    private EditText edC,edF;

   private View.OnClickListener myLis = new View.OnClickListener() {
        @Override
        public void onClick(View arg0) {

            edC=(EditText)findViewById(R.id.txtdoc);
            edF=(EditText)findViewById(R.id.txtdof);

            if(arg0==btnC) {

                edC.setText(Integer.parseInt(edF.getText().toString())*9/5+32);
            }
            if(arg0==btnF){

                edF.setText(Integer.parseInt(edC.getText().toString())-32*5/9);
            }
            else if(arg0==btnClear){
                edC.setText("");
                edF.setText("");

            }

        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnC=(Button)findViewById(R.id.btndoiC);
        btnF=(Button)findViewById(R.id.btndoiF);
        btnClear=(Button)findViewById(R.id.btnclear);
        edC=(EditText)findViewById(R.id.txtdoc);
        edF=(EditText)findViewById(R.id.txtdof);
        btnF.setOnClickListener(myLis);
        btnC.setOnClickListener(myLis);
        btnClear.setOnClickListener(myLis);


    }
}

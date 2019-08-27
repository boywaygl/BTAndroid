package com.example.student.bt2_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btntong(View v){
        EditText edtsoA = (EditText)findViewById(R.id.edtsoA);
        int a = Integer.parseInt(edtsoA.getText()+"");
        EditText edtsoB = (EditText)findViewById(R.id.edtsoB);
        int b = Integer.parseInt(edtsoB.getText()+"");
        TextView txt = (TextView)findViewById(R.id.tv1);
        txt.setText((a+b)+"");
    }
    public void btnhieu(View v){
        EditText edtsoA = (EditText)findViewById(R.id.edtsoA);
        int a = Integer.parseInt(edtsoA.getText()+"");
        EditText edtsoB = (EditText)findViewById(R.id.edtsoB);
        int b = Integer.parseInt(edtsoB.getText()+"");
        TextView txt = (TextView)findViewById(R.id.tv1);
        txt.setText((a-b)+"");
    }
    public void btntich(View v){
        EditText edtsoA = (EditText)findViewById(R.id.edtsoA);
        int a = Integer.parseInt(edtsoA.getText()+"");
        EditText edtsoB = (EditText)findViewById(R.id.edtsoB);
        int b = Integer.parseInt(edtsoB.getText()+"");
        TextView txt = (TextView)findViewById(R.id.tv1);
        txt.setText((a*b)+"");
    }
    public void btnthuong(View v){
        EditText edtsoA = (EditText)findViewById(R.id.edtsoA);
        int a = Integer.parseInt(edtsoA.getText()+"");
        EditText edtsoB = (EditText)findViewById(R.id.edtsoB);
        int b = Integer.parseInt(edtsoB.getText()+"");
        TextView txt = (TextView)findViewById(R.id.tv1);
        txt.setText((a/b)+"");
    }
    public void btnexit(View v){
        finish();}
}

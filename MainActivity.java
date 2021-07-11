package com.example.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public class NumberMaker{
        int number;
        public boolean isSquare(){
            boolean gh=false;
            for(int i=1;i<number;i++){
                if(number/i==i){
                    gh=true;
                    break;
                }
            }
            return gh;
        }
        public boolean isTriangular() {
            boolean gh = false;
            int i = 0;
            int j = 1;
            while (i >= 0) {
                i = i + j;
                if (i == number) {
                    gh = true;
                    break;
                }
                j = j + 1;
            }
            return gh;
        }

    }
    public void ClickButton(View view){
        EditText bh=(EditText) findViewById(R.id.nikhil);
        NumberMaker nik=new NumberMaker();
        String jkl=bh.getText().toString();
        Integer hgj=Integer.parseInt(jkl);
        nik.number=hgj;
        if(nik.isSquare()==true && nik.isTriangular()==true){
            Toast.makeText(this, hgj+" is both a Square Number and a Triangular number", Toast.LENGTH_LONG).show();
        }
        else if(nik.isSquare()==true && nik.isTriangular()==false){
            Toast.makeText(this, hgj+" is  a Square Number but not a triangular number ", Toast.LENGTH_LONG).show();
        }
        else if(nik.isSquare()==false && nik.isTriangular()==true){
            Toast.makeText(this, hgj+" is not a Square Number but a Triangular number", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, hgj+" is neither a square number nor a triangular number ", Toast.LENGTH_LONG).show();
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
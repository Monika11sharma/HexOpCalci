package com.example.hexopcalci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edt1,edt2;
    TextView ans;
    Button b1,b2,b3,b4,b5,b6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1=findViewById(R.id.et1);
        edt2=findViewById(R.id.et2);

        ans=findViewById(R.id.TV1);


        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a,b,c;
                a=Integer.parseInt(edt1.getText().toString());
                b=Integer.parseInt(edt2.getText().toString());
                c=a+b;
                String result=String.valueOf(c);
                ans.setText(result);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a,b,c;
                a=Integer.parseInt(edt1.getText().toString());
                b=Integer.parseInt(edt2.getText().toString());
                c=a-b;
                String result=String.valueOf(c);
                ans.setText(result);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a,b,c;
                a=Integer.parseInt(edt1.getText().toString());
                b=Integer.parseInt(edt2.getText().toString());
                c=a*b;
                String result=String.valueOf(c);
                ans.setText(result);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a,b,c;
                a=Integer.parseInt(edt1.getText().toString());
                b = Integer.parseInt(edt2.getText().toString());
                c=a/b;
                String result=String.valueOf(c);
                ans.setText(result);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a,b,c;
                a=Integer.parseInt(edt1.getText().toString());
                b=Integer.parseInt(edt2.getText().toString());
                c=a*b;
                while(a!=b)
                {
                    if(a>b)
                        a=a-b;
                    else
                        b=b-a;
                }
                String result=String.valueOf(c/a);
                ans.setText(result);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a,b;
                a=Integer.parseInt(edt1.getText().toString());
                b=Integer.parseInt(edt2.getText().toString());
                while (a!=b)
                {
                    if(a>b)
                        a=a-b;
                    else
                        b=b-a;
                }
                String result=String.valueOf(a);
                ans.setText(result);
            }
        });
    }
}

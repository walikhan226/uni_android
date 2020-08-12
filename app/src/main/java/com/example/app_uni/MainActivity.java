package com.example.app_uni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    EditText a;
    TextView lb1,lb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a=(EditText) findViewById(R.id.txt1);
        lb1=(TextView) findViewById(R.id.lbl1);
        lb2=(TextView) findViewById(R.id.lbl2);
    }

    public void onClick1 (View view)
    {
        String b;
        b=a.getText()+"1";
        a.setText(b);
    }
    public void onClick2 (View view)
    {
        String b;
        b=a.getText()+"2";
        a.setText(b);
    }
    public void onClick3 (View view)
    {
        String b;
        b=a.getText()+"3";
        a.setText(b);
    }
    public void onClick4 (View view)
    {
        String b;
        b=a.getText()+"4";
        a.setText(b);;
    }
    public void onClick5 (View view)
    {
        String b;
        b=a.getText()+"5";
        a.setText(b);
    }
    public void onClick6 (View view)
    {
        String b;
        b=a.getText()+"6";
        a.setText(b);
    }
    public void onClick7 (View view)
    {
        String b;
        b=a.getText()+"7";
        a.setText(b);
    }
    public void onClick8 (View view)
    {
        String b;
        b=a.getText()+"8";
        a.setText(b);
    }
    public void onClick9 (View view) {
        String b;
        b=a.getText()+"9";
        a.setText(b);
    }
    public void onClick0 (View view)
    {
        String b;
        b=a.getText()+"0";
        a.setText(b);
    }
    public void onClickP (View view)
    {
        String b;
        b=a.getText().toString();
        lb1.setText(b);
        lb2.setText("+");
        a.setText("");
    }
    public void onClickm (View view)
    {
        String b;
        b=a.getText().toString();
        lb1.setText(b);
        lb2.setText("-");
        a.setText("");
    }
    public void onClickmu (View view)
    {
        String b;
        b=a.getText().toString();
        lb1.setText(b);
        lb2.setText("*");
        a.setText("");
    }
    public void onClickdv (View view)
    {
        String b;
        b=a.getText().toString();
        lb1.setText(b);
        lb2.setText("/");
        a.setText("");
    }
    public void Result (View view)
    {


        try{
            String A,B;
            int X,Y,R=0;
            char O;
            A=lb1.getText().toString();
            B=a.getText().toString();
            O=lb2.getText().toString().charAt(0);
            X=Integer.parseInt(A);
            Y=Integer.parseInt(B);
            switch(O)
            {
                case '+':
                    R=X+Y;
                    break;
                case '-':
                    R=X-Y;
                    break;
                case'*':
                    R=X*Y;
                    break;
                case '/':
                    R=X/Y;
                    break;

            }
            a.setText(""+R);
        }catch (Exception ex){



        }



    }

}
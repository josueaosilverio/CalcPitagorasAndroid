package com.example.josue.exercicio3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcularClick(View v) {

        TextView x1Box = (TextView) findViewById(R.id.inputX1);
        String x1Str = x1Box.getText().toString();
        double x1;
        if (x1Str.length() == 0) {
            x1 = 0;
        } else {
            x1 = Double.parseDouble(x1Str);
        }
        TextView y1Box = (TextView) findViewById(R.id.inputY1);
        String y1Str = y1Box.getText().toString();
        double y1;
        if (y1Str.length() == 0) {
            y1 = 0;
        } else {
            y1 = Double.parseDouble(y1Str);
        }
        TextView x2Box = (TextView) findViewById(R.id.inputX2);
        String x2Str = x2Box.getText().toString();
        double x2;
        if (x2Str.length() == 0) {
            x2 = 0;
        } else {
            x2 = Double.parseDouble(x2Str);
        }
        TextView y2Box = (TextView) findViewById(R.id.inputY2);
        String y2Str = y2Box.getText().toString();
        double y2;
        if (y2Str.length() == 0) {
            y2 = 0;
        } else {
            y2 = Double.parseDouble(y2Str);
        }


        ponto2D p1 = new ponto2D(x1, y1);
        ponto2D p2 = new ponto2D(x2, y2);
        double dist1 = p1.distanciaCentro();
        double dist2 = p2.distanciaCentro();
        double dist3 = p1.distanciaPontos(p2);

        String dist1Str = String.format("%.2f", dist1);
        String dist2Str = String.format("%.2f", dist2);
        String dist3Str = String.format("%.2f", dist3);

        TextView box1 = (TextView) findViewById(R.id.res1);
        box1.setText(dist1Str);
        TextView box2 = (TextView) findViewById(R.id.res2);
        box2.setText(dist2Str);
        TextView box3 = (TextView) findViewById(R.id.res3);
        box3.setText(dist3Str);
    }

    public void subAdd(View v) {
        TextView addSubBox;
        String addSubStr;
        double addSub;
        String addSubStr2;
        switch (v.getId()) {
            case R.id.addX1:
                addSubBox = (TextView) findViewById(R.id.inputX1);
                addSubStr = addSubBox.getText().toString();
                if (addSubStr.length() == 0) {
                    addSub = 0;
                } else {
                    addSub = Double.parseDouble(addSubStr);
                }
                addSub++;
                addSubStr2 = String.valueOf(addSub);
                addSubBox.setText(addSubStr2);
                break;

            case R.id.addX2:
                addSubBox = (TextView) findViewById(R.id.inputX2);
                addSubStr = addSubBox.getText().toString();
                if (addSubStr.length() == 0) {
                    addSub = 0;
                } else {
                    addSub = Double.parseDouble(addSubStr);
                }
                addSub++;
                addSubStr2 = String.valueOf(addSub);
                addSubBox.setText(addSubStr2);
                break;
            case R.id.addY1:
                addSubBox = (TextView) findViewById(R.id.inputY1);
                addSubStr = addSubBox.getText().toString();
                if (addSubStr.length() == 0) {
                    addSub = 0;
                } else {
                    addSub = Double.parseDouble(addSubStr);
                }
                addSub++;
                addSubStr2 = String.valueOf(addSub);
                addSubBox.setText(addSubStr2);
                break;
            case R.id.addY2:
                addSubBox = (TextView) findViewById(R.id.inputY2);
                addSubStr = addSubBox.getText().toString();
                if (addSubStr.length() == 0) {
                    addSub = 0;
                } else {
                    addSub = Double.parseDouble(addSubStr);
                }
                addSub++;
                addSubStr2 = String.valueOf(addSub);
                addSubBox.setText(addSubStr2);
                break;
            case R.id.subX1:
                addSubBox = (TextView) findViewById(R.id.inputX1);
                addSubStr = addSubBox.getText().toString();
                if (addSubStr.length() == 0) {
                    addSub = 0;
                } else {
                    addSub = Double.parseDouble(addSubStr);
                }
                addSub--;
                addSubStr2 = String.valueOf(addSub);
                addSubBox.setText(addSubStr2);
                break;
            case R.id.subX2:
                addSubBox = (TextView) findViewById(R.id.inputX2);
                addSubStr = addSubBox.getText().toString();
                if (addSubStr.length() == 0) {
                    addSub = 0;
                } else {
                    addSub = Double.parseDouble(addSubStr);
                }
                addSub--;
                addSubStr2 = String.valueOf(addSub);
                addSubBox.setText(addSubStr2);
                break;
            case R.id.subY1:
                addSubBox = (TextView) findViewById(R.id.inputY1);
                addSubStr = addSubBox.getText().toString();
                if (addSubStr.length() == 0) {
                    addSub = 0;
                } else {
                    addSub = Double.parseDouble(addSubStr);
                }
                addSub--;
                addSubStr2 = String.valueOf(addSub);
                addSubBox.setText(addSubStr2);
                break;
            case R.id.subY2:
                addSubBox = (TextView) findViewById(R.id.inputY2);
                addSubStr = addSubBox.getText().toString();
                if (addSubStr.length() == 0) {
                    addSub = 0;
                } else {
                    addSub = Double.parseDouble(addSubStr);
                }
                addSub--;
                addSubStr2 = String.valueOf(addSub);
                addSubBox.setText(addSubStr2);
                break;

        }

    }
}


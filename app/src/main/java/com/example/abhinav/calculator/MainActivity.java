package com.example.abhinav.calculator;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



        Button b1;
        Button b10;
        Button b11;
        Button b12;
        Button b13;
        Button b14;
        Button b15;
        Button b16;
        Button b17;
        Button b2;
        Button b3;
        Button b4;
        Button b5;
        Button b6;
        Button b7;
        Button b8;
        Button b9;

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView((int) R.layout.activity_main);
            this.b1 = (Button) findViewById(R.id.button);
            this.b2 = (Button) findViewById(R.id.button2);
            this.b3 = (Button) findViewById(R.id.button3);
            this.b4 = (Button) findViewById(R.id.button4);
            this.b5 = (Button) findViewById(R.id.button5);
            this.b6 = (Button) findViewById(R.id.button6);
            this.b7 = (Button) findViewById(R.id.button7);
            this.b8 = (Button) findViewById(R.id.button8);
            this.b9 = (Button) findViewById(R.id.button9);
            this.b10 = (Button) findViewById(R.id.button10);
            this.b11 = (Button) findViewById(R.id.button11);
            this.b12 = (Button) findViewById(R.id.button12);
            this.b13 = (Button) findViewById(R.id.button13);
            this.b14 = (Button) findViewById(R.id.button14);
            this.b15 = (Button) findViewById(R.id.button15);
            this.b16 = (Button) findViewById(R.id.button16);
            this.b17 = (Button) findViewById(R.id.button17);
            this.b1.setOnClickListener(this);
            this.b2.setOnClickListener(this);
            this.b3.setOnClickListener(this);
            this.b4.setOnClickListener(this);
            this.b5.setOnClickListener(this);
            this.b6.setOnClickListener(this);
            this.b7.setOnClickListener(this);
            this.b8.setOnClickListener(this);
            this.b9.setOnClickListener(this);
            this.b10.setOnClickListener(this);
            this.b11.setOnClickListener(this);
            this.b12.setOnClickListener(this);
            this.b13.setOnClickListener(this);
            this.b14.setOnClickListener(this);
            this.b15.setOnClickListener(this);
            this.b16.setOnClickListener(this);
            this.b17.setOnClickListener(this);
        }

        public void onClick(final View view) {
            TextView textview = (TextView) findViewById(R.id.textView);
            view.animate().rotation(-360f).setDuration(0);
            final Handler handler = new Handler();
            Timer t = new Timer();
            t.schedule(new TimerTask() {
                public void run() {
                    handler.post(new Runnable() {
                        public void run() {

                            view.animate().rotation(360f).setDuration(200);

                        }
                    });
                }
            }, 1);





            switch (view.getId()) {
                case R.id.button:
                    textview.setText(textview.getText().toString() + "1");
                    return;
                case R.id.button10:
                    textview.setText(textview.getText().toString() + "0");
                    return;
                case R.id.button11:
                    textview.setText(textview.getText().toString() + "+");
                    return;
                case R.id.button12:
                    textview.setText(textview.getText().toString() + "-");
                    return;
                case R.id.button13:
                    textview.setText(textview.getText().toString() + "*");
                    return;
                case R.id.button14:
                    textview.setText(textview.getText().toString() + "/");
                    return;
                case R.id.button15:
                    textview.setText("");
                    return;
                case R.id.button16: {
                    String s = textview.getText().toString();
                    int l = -1;
                    ArrayList<String> arr = new ArrayList();
                    int i = 0;
                    while (i < s.length()) {
                        if (s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/') {
                            int k = i;
                            arr.add(s.substring(l + 1, k));
                            arr.add(s.substring(k, k + 1));
                            l = k;
                        }
                        i++;
                    }
                    arr.add(s.substring(l + 1));
                    String[] a = new String[]{"/", "*", "-", "+"};
                    int e = 0;
                    while (arr.size() != 1) {
                        int r = 0;
                        while (r < arr.size() && arr.size() != 1) {
                            if (((String) arr.get(r)).toString().equals(a[e])) {
                                double o = Double.parseDouble((String) arr.get(r - 1));
                                double q = Double.parseDouble((String) arr.get(r + 1));
                                double p = 0.0d;
                                if (a[e] == "/") {
                                    p = o / q;
                                } else if (a[e] == "*") {
                                    p = o * q;
                                } else if (a[e] == "+") {
                                    p = o + q;
                                } else if (a[e] == "-") {
                                    p = o - q;
                                }
                                arr.remove(r - 1);
                                arr.remove(r - 1);
                                arr.remove(r - 1);
                                arr.add(r - 1, Double.toString(p));
                                r = -1;
                            }
                            r++;
                        }
                        if (r == arr.size()) {
                            e++;
                        }
                    }
                    textview.setText((CharSequence) arr.get(0));
                }
                    return;
                case R.id.button17:
                    textview.setText(textview.getText().toString() + ".");
                    return;
                case R.id.button2:
                    textview.setText(textview.getText().toString() + "2");
                    return;
                case R.id.button3:
                    textview.setText(textview.getText().toString() + "3");
                    return;
                case R.id.button4:
                    textview.setText(textview.getText().toString() + "4");
                    return;
                case R.id.button5:
                    textview.setText(textview.getText().toString() + "5");
                    return;
                case R.id.button6:
                    textview.setText(textview.getText().toString() + "6");
                    return;
                case R.id.button7:
                    textview.setText(textview.getText().toString() + "7");
                    return;
                case R.id.button8:
                    textview.setText(textview.getText().toString() + "8");
                    return;
                case R.id.button9:
                    textview.setText(textview.getText().toString() + "9");
                    return;
                default:
                    return;
            }
        }
    }





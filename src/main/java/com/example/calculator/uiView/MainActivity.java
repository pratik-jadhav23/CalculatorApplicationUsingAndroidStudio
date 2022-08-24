package com.example.calculator.uiView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.*;
import com.example.calculator.uiView.Ex;
import java.util.regex.*;

import com.example.calculator.R;

public class MainActivity extends AppCompatActivity {

    public static boolean dotResult = true;
    public static boolean subtractionBoolean = true;
    //Add   div     mul     sub

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BODMAS obj = new BODMAS();
        Ex exObj = new Ex();
        DivisionCheck divisionCheckObj = new DivisionCheck();
        Buttons buttonsObj = new Buttons();
        int cutCount = 1;
        TextView text = (TextView) findViewById(R.id.textView);
        TextView text2 = (TextView) findViewById(R.id.textView2);

        //EditText edit2 = (EditText) findViewById(R.id.editTextNumberDecimal);
        //EditText edit3 = (EditText) findViewById(R.id.editTextTextPersonName);
        //String content = edit3.getText().toString();

        Button button_Equals = (Button) findViewById(R.id.buttonEql);
        button_Equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String resultString = buttonsObj.Equals(text.getText().toString());
                text2.setText(resultString);
            }
        });


        Button button_Clear = (Button) findViewById(R.id.buttonClear);
        button_Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText("");
                text2.setText("");
                //System.out.println();
                dotResult = true;
                //subtractionBoolean = true;



            }
        });

        Button button_Delete = (Button) findViewById(R.id.buttonCut);
        button_Delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //cutCount++;

                if(text.getText().toString().length()!=0){
                    button_Delete.setOnLongClickListener(new View.OnLongClickListener() {
                        @Override
                        public boolean onLongClick(View view) {
                            text.setText("");
                            dotResult = true;
                            subtractionBoolean = true;
                            return true;
                        }
                    });


                    String str = text.getText().toString();

                    char[] ch = new char[str.length()-1];
                    //System.out.println("text ======== "+text2);
                    //text2.setTextKeepState(str);
                    //text2.setText(str.length()-1);

                    if((text.getText().charAt(text.getText().toString().length()-1)=='.')){
                        for(int i=0;i<str.length()-1;i++)
                            ch[i] = str.charAt(i);
                        text.setText(ch, 0, str.length()-1);
                        dotResult = true;
                        //subtractionBoolean = true;
                    }



                    for(int i=0;i<str.length()-1;i++)
                        ch[i] = str.charAt(i);
                    text.setText(ch, 0, str.length()-1);


                }






                 //text.setText(); parse

            }
        });

        Button button_Dot = (Button) findViewById(R.id.buttonDot);
        button_Dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text.getText().toString().length()==0){
                    text.setText("0.");
                    dotResult = false;
                }


                else if(exObj.check(text.getText().charAt(text.getText().toString().length()-1))){
                    System.out.println("text.getText().charAt(text.getText().toString().length()-1)) === "+exObj.check(text.getText().charAt(text.getText().toString().length()-1)));
                    text.append("0.");
                    dotResult = false;
                }
                else if(text.getText().charAt(text.getText().toString().length()-1)!='.' && dotResult == true){
                    text.append(".");
                    System.out.println("Inside Else dotResult ===== "+dotResult);
                    dotResult = false;
                }
                subtractionBoolean = true;
                    //System.out.println("dotResult ======= "+dotResult); //!ERROR for ip 00000000

            }
        });

        Button button_1 = (Button) findViewById(R.id.button1);
        button_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button_1 click
                //System.out.println("CONTENT --------==="+edit);
                //double OP1 = Double.parseDouble(edit.getText().toString());
                //double OP2 = Double.parseDouble(edit2.getText().toString());
                text.append("1");
                subtractionBoolean = true;

                //System.out.println("Decimal number ====== ");
            }
        });

        Button button_2 = (Button) findViewById(R.id.button2);
        button_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button_1 click
                //System.out.println("CONTENT --------==="+edit);
                //double OP1 = Double.parseDouble(edit.getText().toString());
                //double OP2 = Double.parseDouble(edit2.getText().toString());
                text.append("2");
                subtractionBoolean = true;
                //System.out.println("Decimal number ====== ");
            }
        });

        Button button_3 = (Button) findViewById(R.id.button3);
        button_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                //System.out.println("CONTENT --------==="+edit);
                //double OP1 = Double.parseDouble(edit.getText().toString());
                //double OP2 = Double.parseDouble(edit2.getText().toString());
                text.append("3");
                subtractionBoolean = true;
                //System.out.println("Decimal number ====== ");
            }
        });

        Button button_4 = (Button) findViewById(R.id.button4);
        button_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                //System.out.println("CONTENT --------==="+edit);
                //double OP1 = Double.parseDouble(edit.getText().toString());
                //double OP2 = Double.parseDouble(edit2.getText().toString());
                text.append("4");
                subtractionBoolean = true;
                //System.out.println("Decimal number ====== ");
            }
        });

        Button button_5 = (Button) findViewById(R.id.button5);
        button_5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                //System.out.println("CONTENT --------==="+edit);
                //double OP1 = Double.parseDouble(edit.getText().toString());
                //double OP2 = Double.parseDouble(edit2.getText().toString());
                text.append("5");
                subtractionBoolean = true;
                //System.out.println("Decimal number ====== ");
            }
        });

        Button button_6 = (Button) findViewById(R.id.button6);
        button_6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                //System.out.println("CONTENT --------==="+edit);
                //double OP1 = Double.parseDouble(edit.getText().toString());
                //double OP2 = Double.parseDouble(edit2.getText().toString());
                text.append("6");
                subtractionBoolean = true;
                //System.out.println("Decimal number ====== ");
            }
        });

        Button button_7 = (Button) findViewById(R.id.button7);
        button_7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                //System.out.println("CONTENT --------==="+edit);
                //double OP1 = Double.parseDouble(edit.getText().toString());
                //double OP2 = Double.parseDouble(edit2.getText().toString());
                text.append("7");
                subtractionBoolean = true;
                //System.out.println("Decimal number ====== ");
            }
        });

        Button button_8 = (Button) findViewById(R.id.button8);
        button_8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                //System.out.println("CONTENT --------==="+edit);
                //double OP1 = Double.parseDouble(edit.getText().toString());
                //double OP2 = Double.parseDouble(edit2.getText().toString());
                text.append("8");
                subtractionBoolean = true;
                //System.out.println("Decimal number ====== ");
            }
        });

        Button button_9 = (Button) findViewById(R.id.button9);
        button_9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                //System.out.println("CONTENT --------==="+edit);
                //double OP1 = Double.parseDouble(edit.getText().toString());
                //double OP2 = Double.parseDouble(edit2.getText().toString());
                text.append("9");
                subtractionBoolean = true;
                //System.out.println("Decimal number ====== ");
            }
        });

        Button button_0 = (Button) findViewById(R.id.button0);
        button_0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                //System.out.println("CONTENT --------==="+edit);
                //double OP1 = Double.parseDouble(edit.getText().toString());
                //double OP2 = Double.parseDouble(edit2.getText().toString());
                text.append("0");
                subtractionBoolean = true;
                //System.out.println("Decimal number ====== ");
            }
        });

        Button button_00 = (Button) findViewById(R.id.button00);
        button_00.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                //System.out.println("CONTENT --------==="+edit);
                //double OP1 = Double.parseDouble(edit.getText().toString());
                //double OP2 = Double.parseDouble(edit2.getText().toString());
                //text.setText("00");
                text.append("00");
                subtractionBoolean = true;
                //System.out.println("Decimal number ====== ");
            }
        });





        Button button_Addition = (Button) findViewById(R.id.buttonAdd);
        button_Addition.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                //System.out.println("CONTENT --------==="+edit);
                //double OP1 = Double.parseDouble(edit.getText().toString());
                //double OP2 = Double.parseDouble(edit2.getText().toString());
                //text.setText("+");
                //System.out.println("button_Addition.getText() ====== "+button_Addition.getText());
                if(text.getText().toString().length()!=0){
                    if((text.getText().charAt(text.getText().toString().length()-1))=='.'){
                        text.append("0+");
                    }
                    else if(!(exObj.check(text.getText().charAt(text.getText().toString().length()-1)))) {
                        text.append(button_Addition.getText());
                        //subtractionBoolean = true;
                    }
                }

                dotResult=true;


                //System.out.println("Decimal number ====== ");
            }
        });

        Button button_Subtraction = (Button) findViewById(R.id.buttonSub);
        button_Subtraction.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                //System.out.println("CONTENT --------==="+edit);
                //double OP1 = Double.parseDouble(edit.getText().toString());
                //double OP2 = Double.parseDouble(edit2.getText().toString());
                System.out.println("subtractionBoolean==========="+ subtractionBoolean);
                //text.setText("-");
                if(text.getText().toString().length()!=0 && text.getText().charAt(text.getText().toString().length()-1)!='%') {
                    if ((text.getText().charAt(text.getText().toString().length() - 1)) == '.') {
                        text.append("0-");
                    }


                        /*else if(text.getText().toString().length()-1!=0 && subtractionBoolean == true){
                        text.append("-");
                        subtractionBoolean = false;
                        System.out.println("==subtractionBoolean = false==");*/
                    /*else if (text.getText().toString().length() - 1 != 0 && text.getText().charAt(text.getText().toString().length()-1) == '-' && subtractionBoolean == true) {
                        text.append("-");
                        subtractionBoolean = false;
                    }*/
                    //&& text.getText().charAt(text.getText().toString().length()-1)!='-'
                    //&& text.getText().charAt(text.getText().toString().length()-1)!='-'
                    else if(text.getText().toString().length()-1!=0){
                        if(exObj.check(text.getText().charAt(text.getText().toString().length()-1)) && subtractionBoolean == true){
                            text.append("-");
                            subtractionBoolean = false;
                        }
                        else if(buttonsObj.Subtraction(text.getText().charAt(text.getText().toString().length()-1)))
                            text.append("-");
                    }

                    /*else {
                        text.append("-");
                    }*/
                    /*else if(text.getText().toString().length() - 1 != 0 && subtractionBoolean == true){
                        text.append("-");
                    }*/
                }
                else if(text.getText().toString().length() == 0){
                    text.append("-");

                }
                /*else if(text.getText().toString().length()>=)
                    text.append("hello");*/

                dotResult=true;
                System.out.println("subtractionBoolean==========="+ subtractionBoolean);
                //System.out.println("Decimal number ====== ");
            }
        });

        Button button_Multiplication = (Button) findViewById(R.id.buttonMul);
        button_Multiplication.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                //System.out.println("CONTENT --------==="+edit);
                //double OP1 = Double.parseDouble(edit.getText().toString());
                //double OP2 = Double.parseDouble(edit2.getText().toString());
                //text.setText("*");

                if(text.getText().toString().length()!=0) {
                    if ((text.getText().charAt(text.getText().toString().length() - 1)) == '.') {
                        text.append("0*");
                    }
                    else if(!(exObj.check(text.getText().charAt(text.getText().toString().length() - 1)))){
                        text.append("*");
                        //subtractionBoolean = true;
                    }
                }
                dotResult=true;
                //System.out.println("Decimal number ====== ");
            }
        });

        Button button_Division = (Button) findViewById(R.id.buttonDiv);
        button_Division.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                //System.out.println("CONTENT --------==="+edit);
                //double OP1 = Double.parseDouble(edit.getText().toString());
                //double OP2 = Double.parseDouble(edit2.getText().toString());
                //text.setText("/");

                if(text.getText().toString().length()!=0) {
                    if ((text.getText().charAt(text.getText().toString().length() - 1)) == '.') {
                        text.append("0/");
                        //subtractionBoolean = false;
                    }

                    else if(!(exObj.check(text.getText().charAt(text.getText().toString().length() - 1)))){
                        text.append("/");
                        //subtractionBoolean = false;
                    }
                }
                dotResult=true;
                //System.out.println("Decimal number ====== ");
            }
        });

        Button button_Modulas = (Button) findViewById(R.id.buttonModulas);
        button_Modulas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                //System.out.println("CONTENT --------==="+edit);
                //double OP1 = Double.parseDouble(edit.getText().toString());
                //double OP2 = Double.parseDouble(edit2.getText().toString());
                //text.setText("%");

                if(text.getText().toString().length()!=0) {
                    if ((text.getText().charAt(text.getText().toString().length() - 1)) == '.') {
                        text.append("0%");
                    }
                    else if(!(exObj.check(text.getText().charAt(text.getText().toString().length() - 1)))) {
                        text.append("%");

                    }
                }
                dotResult=true;
                //System.out.println("Decimal number ====== ");
            }
        });






    }
}
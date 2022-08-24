package com.example.calculator.uiView;
import java.util.regex.*;
import com.example.calculator.uiView.MainActivity.*;

public class Ex {
//Pattern p = Pattern.compile()

    public boolean check(char ch){
        if(ch=='+'||ch=='-'||ch=='/'||ch=='*'||ch=='%')
        return true;
        else
            return false;
    }
    /*public void checkDot(char ch){
        if(ch=='.'){
            text.append("0+");
        }
        else{
            text.append(button_Addition.getText()); //parse
        }
    }
*/


    public String Result(String str){
        String resultString;
        Pattern p = Pattern.compile("[+-/*%]");

        return "resultString";
    }
}

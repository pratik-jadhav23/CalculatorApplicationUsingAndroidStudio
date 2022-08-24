package com.example.calculator.uiView;
import java.util.regex.*;

public class Buttons {
    Pattern p = Pattern.compile("[+-/*%]");
    Pattern p2 = Pattern.compile("[^0-9]");
    Pattern p3 = Pattern.compile("[0-9|.]+");
    public Buttons() {
    }
    public String Equals(String str){

        if(str.length()!=0){

            Matcher m = p.matcher(String.valueOf(str.charAt(str.length()-1)));
            Matcher m2 = p2.matcher(str);
            Matcher m3 = p3.matcher(str);
            boolean validStr = m2.find();
            System.out.println("m.matches() ====== "+m.matches());
            if(m3.matches()) return str;
            else if(!m.matches() && validStr){
                for(int i =0;i<str.length();i++){
                }
             return "validstring";
            }
        }
        return "";
    }

    public boolean Subtraction(char ch){
        Matcher matcher = p3.matcher(String.valueOf(ch));
        if(matcher.matches())
        return true;
        else
            return false;
    }
}

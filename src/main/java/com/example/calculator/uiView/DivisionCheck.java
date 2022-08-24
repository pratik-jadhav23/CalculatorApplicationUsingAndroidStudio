package com.example.calculator.uiView;

public class DivisionCheck {
    public boolean DivisionCheck(char ch){

        if(ch=='+'||ch=='-'||ch=='/'||ch=='*'||ch=='%')
            return true;
        else
            return false;
    }
}

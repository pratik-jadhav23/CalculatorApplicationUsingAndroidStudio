package com.example.calculator.uiView;
public class BODMAS {
    public double BODMAS(double a, char ch, double b){
        double result = 0;
        switch (ch){
            case '+':
                result = a+b;
                break;
            case '-':
                result = a-b;
                break;
            case '*':
                result = a*b;
                break;
            case '/':
                result = a/b;
                break;
            default:
                System.out.println("Syntax ERROR!");
                break;
        }
        System.out.println(result);
        return result;
    }



}


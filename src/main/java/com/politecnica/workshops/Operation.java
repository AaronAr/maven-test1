package com.politecnica.workshops;

public class Operation {
    public  int suma(int a, int b){
       int result = a + b;
       if(result<10){
           throw new RuntimeException("La suma debe de ser igual a 10");
       }

        return  result;
    }
}

package com.generation;

public class Calculator {
    public int addNumbers(int num1, int num2){
        return num1 + num2;
    }

    public int subtractNumbers(int num1, int num2){
        return num1 - num2;
    }

    public float divideNumbers(int num1, int num2){ //corregir
        //en caso de qye num2 ==0
//        if(num2==0){
//            return 0;
//        }else{
//            return num1 / num2;
//        }
        float result=0;
        try{
            result=num1/num2;
        }catch (Exception e){
            System.out.println("Error"+e.getMessage());
            result=0;
        }finally {
            return result;
        }

    }

    public int multiplyNumbers(int num1, int num2){
        return num1 * num2;
    }
}

package com.generation;

public class CalculatorTDD {
    public int addNumbers(int num1, int num2){
        return num1 + num2;
    }

    public int subtractNumbers(int num1, int num2){
        return num1 - num2;
    }

    public float divideNumbers(int num1, int num2){
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

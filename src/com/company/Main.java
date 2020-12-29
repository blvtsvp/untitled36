package com.company;


public class Main {
    public static int getFact(int f) {
        if (f <= 1) {
            return 1;
        }
        else {
            return f * getFact(f - 1);
        }
    }
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <=9;i+=2){
            sum += getFact(i);
        }
        System.out.println("Sum = "+ sum);
    }
}

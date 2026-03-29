package com.gla.string;

import java.util.Scanner;

public class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    public int mul(int num1, int num2) {
        return num1 * num2;
    }

    public int div(int num1, int num2) {
        return num1/num2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the first number:-");
        int a = sc.nextInt();
        System.out.println("enter the two number:-");
        int b = sc.nextInt();

        Calculator c1= new Calculator();
        int add =c1.add(a,b);
        System.out.println("addition of two number :-" +add);
        int sub = c1.sub(a,b);
        System.out.println("subtraction of two number:-" +sub);
        int mul =c1.mul(a,b);
        System.out.println("multiplication of two number:-" +mul);
        int div =c1.div(a,b);
        System.out.println("division of two number:-" +div);


    }
}

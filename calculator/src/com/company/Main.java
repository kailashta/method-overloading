package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Integer ");
        int integer1  = sc.nextInt();
        int integer2  = sc.nextInt();

        System.out.println("Enter Two Floating Numbers");
        float float1 = sc.nextFloat();
        float float2 = sc.nextFloat();

        System.out.println("Enter Two Double Numbers");
        double double1 = sc.nextDouble();
        double double2 = sc.nextDouble();
        arithmeticOperations(integer1,integer2);
        arithmeticOperations(float1,float2);
        arithmeticOperations(double1,double2);
    }

    private static void arithmeticOperations(int integer1, int integer2) {
        System.out.println("The Basic Arithmetic Operation On Two Integers " + integer1 + " " + integer2);
        System.out.println(" Addition Of Two Numbers "+ (integer1 + integer2) );
        System.out.println(" Subtraction Of Two Numbers "+ (integer1 - integer2) );
        System.out.println(" Multiplication Of Two Numbers "+ (integer1 * integer2) );
        System.out.println(" Division Of Two Numbers "+ (integer1 / integer2) );
        System.out.println(" Modulo Of Two Numbers "+ (integer1 % integer2) );
    }
    private static void arithmeticOperations(float f1, float f2){
        System.out.println("The Basic Arithmetic Operation On Two Floating Numbers " + f1 + " " + f2);
        System.out.println(" Addition Of Two Numbers "+ (f1 + f2) );
        System.out.println(" Subtraction Of Two Numbers "+ (f1 - f2) );
        System.out.println(" Multiplication Of Two Numbers "+ (f1 * f2) );
        System.out.println(" Division Of Two Numbers "+ (f1 / f2) );
        System.out.println(" Modulo Of Two Numbers "+ (f1 % f2) );
    }
    private static void arithmeticOperations(double d1 , double d2){
        System.out.println("The Basic Arithmetic Operation On Two Double Numbers " + d1 + " " + d2);
        System.out.println(" Addition Of Two Numbers "+ (d1 + d2) );
        System.out.println(" Subtraction Of Two Numbers "+ (d1 - d2) );
        System.out.println(" Multiplication Of Two Numbers "+ (d1 * d2) );
        System.out.println(" Division Of Two Numbers "+ (d1 / d2) );
        System.out.println(" Modulo Of Two Numbers "+ (d1 % d2) );
    }

}

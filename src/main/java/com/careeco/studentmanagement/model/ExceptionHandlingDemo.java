package com.careeco.studentmanagement.model;

import java.util.Scanner;

public class ExceptionHandlingDemo {

    public static void main(String args[]){
        Scanner scr=new Scanner(System.in);
        System.out.println("Please Enter two Numbers");
        int a =scr.nextInt();
        int b=scr.nextInt();

        double div =(double)a/b;
        try {
            int div1 = a / b;
            System.out.println("Division of Two Numbers is "+ div1);
        }catch(ArithmeticException ae){
            System.out.println("Divisible by zero is not possible");

        }finally{
            System.out.println("finally block Executed");
        }

        System.out.println("Successfully Executed code Signing off!!");



    }


}

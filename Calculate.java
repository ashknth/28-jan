package com.ashok.myapp;

import java.util.Scanner;
public class Calculate {
    public int Add(int a, int b)
    {
        return (a+b);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number:");
         //sc.nextInt();
       // System.out.println("Enter another number:");
         //sc.nextInt();
        Calculate c= new Calculate();
       int z= c.Add(sc.nextInt(),sc.nextInt());
        System.out.println("The addition is :"+z);
    }

}

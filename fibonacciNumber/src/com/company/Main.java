package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Generates the Fibonacci number, only accurate up to 47 series'
        System.out.println("FIBONACCI NUMBER");
        System.out.println("enter number of series:");
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();
        System.out.println("The series is:");

        int a = 0, b = 1, nextNum;
        for (int i = 0; i < j; i++) {
            if(i<=1)
                nextNum=i;
            else {
                nextNum=a+b;
                a=b;
                b=nextNum;
            }
            System.out.println(nextNum);
        }
    }
}

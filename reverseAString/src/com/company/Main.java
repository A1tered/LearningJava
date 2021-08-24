package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //reversing an input with a string through a for loop
        System.out.println("Reversing STRING using FOR LOOP ");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Input String: ");
        String strReverse1 = scanner1.nextLine();

        for (int i = strReverse1.length() - 1; i >= 0; i--){
            System.out.println(strReverse1.charAt(i));
        }

        //reversing an input with an array through a for loop
        System.out.println("Reversing CHAR ARRAY using FOR LOOP ");
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Input String: ");
        String arrReverse = scanner2.nextLine();
        char[] arr = arrReverse.toCharArray();

        for (int j = arr.length - 1; j >= 0; j--){
            System.out.println(arr[j]);
        }
    }
}

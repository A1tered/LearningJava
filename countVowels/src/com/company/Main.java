package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Counts the number of vowels ('a' 'e' 'i' 'o' 'u') that are within a string
        System.out.println("VOWEL COUNTER");
        System.out.println("Input string: ");
        Scanner scanner = new Scanner(System.in);
        String countVowels = scanner.nextLine();

        int x = 0;
        for (int i = 0; i < countVowels.length(); i++) {
                if (countVowels.charAt(i) == 'a' || countVowels.charAt(i) == 'A') {
                    x += 1;
                }
                if (countVowels.charAt(i) == 'e' || countVowels.charAt(i) == 'E') {
                    x += 1;
                }
                if (countVowels.charAt(i) == 'i' || countVowels.charAt(i) == 'I') {
                    x += 1;
                }
                if (countVowels.charAt(i) == 'o' || countVowels.charAt(i) == 'O') {
                    x += 1;
                }
                if (countVowels.charAt(i) == 'u' || countVowels.charAt(i) == 'U') {
                    x += 1;
                }
                /*
                This works too
                If (countVowels.charAt(i) == 'a' || countVowels.charAt(i) == 'A' || countVowels.charAt(i) == 'e' || countVowels.charAt(i) == 'E' || countVowels.charAt(i) == 'i' || countVowels.charAt(i) == 'I' || countVowels.charAt(i) == 'o' || countVowels.charAt(i) == 'O' || countVowels.charAt(i) == 'u' || countVowels.charAt(i) == 'U') {
                    x += 1;
                }
                 */
        }
        System.out.println("There are " + x + " vowel(s)");
    }
}

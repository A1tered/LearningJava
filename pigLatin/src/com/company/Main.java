package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Pig Latin is a game of alterations played on the English language game.
    // To create the Pig Latin form of an English word the initial consonant sound
    // is transposed to the end of the word and an ay is affixed
    // ("banana" would yield anana-bay).
        System.out.println("Pig Latin");
        System.out.println("Input word: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        String Pignow = "";
        String end = "";

        for (int i = 0; i < word.length(); i++) {
            if ((word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u' || word.charAt(i) == 'A' || word.charAt(i) == 'E' || word.charAt(i) == 'I' || word.charAt(i) == 'O' || word.charAt(i) == 'U' )){
                end = word.substring(0, i);
                Pignow = word.substring(i);
                Pignow += "-" + (end + "ay");
                System.out.printf(Pignow);
            }
        }

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'y' || word.charAt(i) == 'Y'){
                end = word.substring(0, i);
                Pignow = word.substring(i);
                Pignow += "-" + (end + "ay");
                System.out.printf(Pignow);
            }
        }
    }
}

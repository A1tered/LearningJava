package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static final String rock = "rock";
    public static final String paper = "paper";
    public static final String scissors = "scissors";

    //Main method
    public static void main(String[] args) {

        System.out.println("Rock, Paper, Scissors!");
        System.out.println("Please enter a move");
        System.out.println("(rock, paper or scissors)");
        String userInput = getUsersMove();
        if (userInput.equals("paper") || userInput.equals("rock") || userInput.equals("scissors")) {
            result(userInput, getComputersMove());
        }
        else{
            System.out.println("Invalid Input " + userInput);
        }
    }

    //Determine the winner
    public static void result (String userMove, String cmpMove){

        String msgWinner = "You win!";
        String msgLoser = "You lose!";
        String msgDraw = "Its a tie!";
        String msgRock = "Rock smashes scissors. ";
        String msgPaper = "Paper covers rock. ";
        String msgScissors = "Scissors cuts paper. ";

        System.out.println("The computer choose " + cmpMove);

        if (userMove.equals(cmpMove))
            System.out.println(msgDraw);
        else if (userMove.equals(rock)) {
            if (cmpMove.equals(paper))
                System.out.println(msgPaper + msgLoser);
            else if (cmpMove.equals(scissors))
                System.out.println(msgRock + msgWinner);
        }
        else if (userMove.equals(paper)) {
            if (cmpMove.equals(rock))
                System.out.println(msgPaper + msgWinner);
            else if (cmpMove.equals(scissors))
                System.out.println(msgScissors + msgLoser);
        }
        else if (userMove.equals(scissors)) {
            if (cmpMove.equals(rock))
                System.out.println(msgRock + msgLoser);
            else if (cmpMove.equals(paper))
                System.out.println(msgScissors + msgWinner);
        }
        else
            System.out.println("Invalid input");
    }

    //Function to get users move
    public static  String getUsersMove(){
        Scanner scanner = new Scanner(System.in);
        //String userMove = scanner.nextLine().toLowerCase();
        //return userMove;                                        Line 68 is a more efficient method of line 66 & 67
        return scanner.nextLine().toLowerCase();
    }

    //Function to generate the computer choice
    public static String getComputersMove(){

        int cmpNum;
        String cmpMove = "";
        Random random = new Random();
        cmpNum = random.nextInt( 3 ) + 1; //random number generator between 1 and 3

        if(cmpNum == 1 ){
            cmpMove = rock;
        }
        else if(cmpNum == 2 ){
            cmpMove = paper;
        }
        else if(cmpNum == 3){
            cmpMove = scissors;
        }
        return cmpMove;
    }
}

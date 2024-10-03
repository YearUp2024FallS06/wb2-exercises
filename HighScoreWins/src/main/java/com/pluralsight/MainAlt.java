package com.pluralsight;

import java.util.*;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MainAlt {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        String userScores = PromptForString("Please enter a game score: ");

        int indexOfBar = userScores.indexOf("|");

        String teamnamesString = userScores.substring(0, indexOfBar);
        String[] teamnames = teamnamesString.split(Pattern.quote(":"));

        String scoresString = userScores.substring(indexOfBar + 1);
        String[] scores = scoresString.split(Pattern.quote(":"));

        String message = computeWinningTeamMessage(teamnames, scores);

        System.out.println(message);

    }


    public static String computeWinningTeamMessage(String[] teamnames, String[] scores){
        int leftScore = Integer.parseInt(scores[0]);
        int rightScore = Integer.parseInt(scores[1]);


        String winner;
        if(leftScore > rightScore){
            winner = teamnames[0];
        } else if (rightScore > leftScore){
            winner = teamnames[1];
        }
        else{
            return "It's a tie!";
        }
        return winner + " wins!";
    }


    public static String PromptForString(String prompt){
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }


}
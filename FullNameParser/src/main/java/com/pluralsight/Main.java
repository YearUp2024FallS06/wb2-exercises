package com.pluralsight;
import java.util.*;

public class Main {


    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        String fullname = PromptForString("Please enter your FULL name: ");

        // "Matt Christenson"
        // "Matt Warner Christenson"
        // "Matt W. Christenson"



        //"Christenson"
        //"Warner Christenson"

        int indexOfFirstSpace = fullname.indexOf(' ');

        String firstName = fullname.substring(0, indexOfFirstSpace);

        String endingpart = fullname.substring(indexOfFirstSpace + 1);

        int indexOfSpaceInEndingPart = endingpart.indexOf(" ");

        String middleName;
        String lastName;

        if(indexOfSpaceInEndingPart < 0){
            //don't have a middle name;
            middleName = "";
            lastName = endingpart;
        }
        else{
            middleName = endingpart.substring(0, indexOfSpaceInEndingPart);
            lastName = endingpart.substring(indexOfSpaceInEndingPart + 1);
        }

        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);


    }


    public static String PromptForString(String prompt){
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
}
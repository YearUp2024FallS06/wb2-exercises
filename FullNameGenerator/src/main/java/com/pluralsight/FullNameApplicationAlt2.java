package com.pluralsight;
import java.util.Scanner;

public class FullNameApplicationAlt2 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //get values from user
        String firstName = PromptForString("First name: ");
        String middleName = PromptForString("Middle name: ");
        String lastName = PromptForString("Last name: ");
        String suffix = PromptForString("Suffix: ");

        //Add appropriate spacing for later concatenation..
        middleName = (middleName.isBlank()) ? " " : " " + middleName + " ";
        suffix = (suffix.isBlank()) ? "" :  ", " + suffix;

        //concatenate the full string
        String fullname = firstName + middleName + lastName + suffix;

        //display
        System.out.println("Hello " + fullname);


    }


    public static String PromptForString(String prompt){
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
}

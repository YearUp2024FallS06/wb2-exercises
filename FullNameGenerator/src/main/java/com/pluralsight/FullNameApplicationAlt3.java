package com.pluralsight;
import java.util.Scanner;

public class FullNameApplicationAlt3 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String firstName = PromptForString("First name: ");
        String middleName = PromptForString("Middle name: ");
        String lastName = PromptForString("Last name: ");
        String suffix = PromptForString("Suffix: ");

        System.out.println("Hello " +  firstName + ((middleName.isBlank()) ? " " : " "+ middleName + " ")  + lastName + ((suffix.isBlank()) ? "" :  ", " + suffix));


    }


    public static String PromptForString(String prompt){
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
}

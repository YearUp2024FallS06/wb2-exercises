package com.pluralsight;
import java.util.Scanner;

public class FullNameApplicationAlt {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String firstName = PromptForString("First name: ");
        String middleName = PromptForString("Middle name: ");
        String lastName = PromptForString("Last name: ");
        String suffix = PromptForString("Suffix: ");

        String fullname;

        if (middleName.isBlank()){
            middleName = " ";
        }
        else{
            middleName = " " + middleName + " ";
        }

        if(!suffix.isBlank()){
            suffix = ", " + suffix;
        }

        fullname = firstName + middleName + lastName + suffix;

        System.out.println("Hello " + fullname);


    }


    public static String PromptForString(String prompt){
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
}

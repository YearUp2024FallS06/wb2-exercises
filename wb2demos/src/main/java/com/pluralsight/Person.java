package com.pluralsight;

public class Person {

    private static String species = getTheSpeciesName();
    private static int numberOfPeople;

    private String firstNameClassLevel;
    private String lastNameClassLevel;
    private int ageClassLevel;


    private static String getTheSpeciesName(){
        System.out.println("okay, getting the species name!");
        return "Human";
    }

    public Person(){
        //this space intentionally left empty.
    }

    public Person(String firstName, String lastName, int age){
        this.firstNameClassLevel = firstName;
        this.lastNameClassLevel = lastName;
        this.ageClassLevel = age;
        numberOfPeople++;

    }

    public Person(String firstName, String lastName){
        this(firstName, lastName, 0);
    }

    public int getAge(){
        return this.ageClassLevel;
    }

    public void setAge(int newAge){
        this.ageClassLevel = newAge;
    }


    public String getFullName(){
        return firstNameClassLevel + " " + lastNameClassLevel;
    }

    public static String getSpecies(){
        return species;
    }

    public static int getNumberOfPeople(){
        return numberOfPeople;
    }


    public void HaveABirthday(){
        this.ageClassLevel += 1;
    }

}

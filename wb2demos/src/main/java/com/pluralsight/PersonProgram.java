package com.pluralsight;

public class PersonProgram {

    public static void main(String[] args){

        //do my stuff.
String somevar;
somevar = "someval";
        System.out.println(somevar);
        Person p1 = new Person("Matt", "Christenson", 43);

        Person p2 = new Person("Ylandre", "Smith-Cash", 30);

        Person p3 = new Person("Adrys", "Gabin");

        Person p4 = new Person();
        p4.HaveABirthday();

        System.out.println(p1.getFullName());
        System.out.println(p2.getFullName());

        p1.setAge(50);

        p3.HaveABirthday();
        p3.HaveABirthday();



        System.out.printf("%s is a %s and is %d years old\n", p1.getFullName(), Person.getSpecies(), p1.getAge());
        System.out.printf("%s is a %s and is %d years old\n", p2.getFullName(), Person.getSpecies(), p2.getAge());
        System.out.printf("%s is a %s and is %d years old\n", p3.getFullName(), Person.getSpecies(), p3.getAge());
        System.out.printf("%s is a %s and is %d years old\n", p4.getFullName(), Person.getSpecies(), p4.getAge());


        System.out.println("There are " + Person.getNumberOfPeople() + " people.");

    }
}

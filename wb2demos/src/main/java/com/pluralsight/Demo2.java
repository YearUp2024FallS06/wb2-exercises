package com.pluralsight;

public class Demo2 {

    public static void main(String[] args){

        String names;

        names = "Matt";
        names += ", Obaid";
        names += ", Ylandre";


        System.out.println(names);

        StringBuilder namesBuilder = new StringBuilder();
        namesBuilder.append("Matt");
        namesBuilder.append(", Obaid");
        namesBuilder.append(", Ylandre");

        String names2 = namesBuilder.toString();

        System.out.println(names2);

    }
}

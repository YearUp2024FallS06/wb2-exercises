package com.pluralsight;

public class Loops1 {


    public static void main(String[] args)  throws InterruptedException
    {

        System.out.println("Begin the countdown!");

        for ( int i = 0 ; i < 5 ; i ++ ){
            Thread.sleep(1000);
            System.out.println("for " + i);

        }

        for ( int z = 4 ; z >= 0 ; z-- ){

            System.out.println("for (backwards) " + z);

        }





        for ( int i = 0 ; i < 10 ; i+= 2 ){

            System.out.println("for (even) " + i);

        }

        int i = 0;
        while ( i < 5 )
        {
            System.out.println("while " + i);


            i++;
        }

    }



}

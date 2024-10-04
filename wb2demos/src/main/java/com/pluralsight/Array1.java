package com.pluralsight;

import java.util.Arrays;

public class Array1 {


    public static void main(String[] args){



        int[] nums = {63, 65, 60, 53, 58, 37, 35, 31};
        //            0    1   2   3   4    5  6  7

        System.out.println(Arrays.toString( nums) );

        nums[5] = 0;
        nums[6] = 0;

        System.out.println(Arrays.toString( nums) );

        System.out.println("------------------------------");
        int[] nums2 = new int[8];

        System.out.println(Arrays.toString( nums2) );

        nums2[0] = 63;
        nums2[1] = 65;
        nums2[2] = 60;
        //...
        nums2[7] = 31;


        System.out.println(Arrays.toString( nums2) );

        for( int num : nums2) {
            System.out.println(num);
        }

        int newnumber = nums2[0] + nums2[1];

        System.out.println(newnumber);


        nums2 = new int[16];

        System.out.println(Arrays.toString( nums2) );

        String[] names = { "Matt", "Lexx", "Musa", "Nikesh" };

        Arrays.sort(names);
        
        System.out.println(Arrays.toString( names) );

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);

        System.out.println("------------------------------");

        for(int indexOfName = 0; indexOfName < names.length ; indexOfName++){
            System.out.println(names[indexOfName]);
        }

        for(int i = 0; i < names.length ; i++){
            String name = names[i];
            System.out.println(name);
        }

        System.out.println("------------------------------");

        for(String name : names){
            System.out.println(name);
        }

        DisplayWithRowNumbers(names);
        System.out.println("------------------------------");

        String[] namesThatStartWithM = GetNamesThatStartWithM(names);
        DisplayWithRowNumbers(namesThatStartWithM);

        ////////

        DisplayWithRowNumbers(GetNamesThatStartWithM(names));
    }

    public static void DisplayWithRowNumbers(String[] values){
        int rowNumber = 1;
        for(String value : values){
            System.out.println(rowNumber + ": " + value);
            rowNumber++;
        }
    }

    public static String[] GetNamesThatStartWithM(String[] names){
        String[] namesStartWithM = new String[names.length];
        int i = 0;
        for(String name : names){
            if(name.startsWith("M")){
                namesStartWithM[i] = name;
                i++;
            }
        }
        String[] result = new String[i];
        System.arraycopy(namesStartWithM,0,result,0, i);

        //for(int j = 0 ; j < i ; j++ ){
        //    result[j] = namesStartWithM[j];
        //}

        return result;
    }


}

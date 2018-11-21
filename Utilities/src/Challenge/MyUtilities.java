//package Challenge;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;

public class MyUtilities {

    // constructor
    public MyUtilities() {

    }

    //    StringThings method
    public String StringThings(char[] arr) {
        String built = new String(arr);
        String upper = built.toUpperCase();
        String lower = built.toLowerCase();
        String length = Integer.toString(built.length());

        return (built + ":" + upper + ":" + lower + ":" + length);
    }

    //    String Clean And Split method
    public String[] StringCleanAndSplit(String str) {
        String[] arr = str.split(",");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].trim();
        }
        return arr;
    }

    //    flip string method
    public String ReverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    //    Date method
    public String WhatDayIsIt() {
        LocalDate today = LocalDate.now();
        return (today.toString());
    }

    //    Time method
    public String TimeBetween(int year1, int month1, int day1, int year2, int month2, int day2) {
        Period timeBetween = Period.between(LocalDate.of(year1, month1, day1), LocalDate.of(year2, month2, day2));
        return timeBetween.toString();
    }

    //  List method
    public String ListMaker() {
        Scanner in = new Scanner(System.in);
        ArrayList<String> myList = new ArrayList<String>();
        while (true) {
            System.out.println("What is next on your list?");
            String scn = in.nextLine();
            if (scn.equals("DONE")) {
                in.close();
                break;
            }
            myList.add(scn);
        }
        return (myList.toString());
    }

}

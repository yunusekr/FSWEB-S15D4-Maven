package org.example;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("Racecar"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindrome("Test"));
        System.out.println(checkForPalindrome("Welcome"));
        System.out.println(convertDecimalToBinary(5));
        System.out.println(convertDecimalToBinary(6));
        System.out.println(convertDecimalToBinary(13));
        WorkintechList asd = new WorkintechList();

    }

    public static boolean checkForPalindrome(String entry){
        StringBuilder reversed = new StringBuilder(entry.replaceAll("[.,?!_\\- ]", "").toLowerCase(Locale.ROOT)).reverse();
        return entry.replaceAll("[.,?!_\\- ]", "").toLowerCase(Locale.ROOT).equals(reversed.toString().replaceAll(" ",""));
    }


    public static String convertDecimalToBinary(int num){
        String bos = "";
        while(num>0){
            bos += String.valueOf(num % 2);
            num = num / 2;
        }
        StringBuilder reversed = new StringBuilder(bos);
        return reversed.reverse().toString();
        }
}
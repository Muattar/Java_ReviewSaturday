package week04_reviewString;

import java.util.Scanner;

public class CombineTwoWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two words for combine:");

        String s1 = scan.next();
        String s2 = scan.next();

        String result = s1 + s2;

        //String s1 = "one";
        //String s2 = "two";

        if (s1.charAt(s1.length()-1) == s2.charAt(0)){//if the last character of the first string is equal to the first character of second string
          result =  s1 + s2.substring(1);
           // System.out.println("Combine word is: " + s1 + s2.substring(1));
        //}else {
          //  System.out.println(s1 + s2);
        }
        System.out.println("Combine word is: " + result);




    }




}

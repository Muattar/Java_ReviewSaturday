package week04_reviewString;

import javax.swing.*;
import java.util.Locale;

public class StringMethodsPractice {

    public static void main(String[] args) {

        // refirance variable
        String str = "Cydeo School";
        char ch = str.charAt(1);

       int length =  str.length();

        System.out.println(ch);
        System.out.println(length);

        int lastIndex = str.length()-1;

        char ch2 = str.charAt(lastIndex);
        System.out.println(ch2);

        int indexOfE = str.indexOf('e');

        System.out.println("indexOfE = " + indexOfE);

        int indexOfFirstO = str.indexOf("oo");
        System.out.println("indexOfFirstO = " + indexOfFirstO);

        System.out.println("---------------------------------");

        String str1 = "BATCH 28";
        System.out.println(str1);//BATCH 28

        str1 = str1.toLowerCase();
        System.out.println(str1);//batch 28

        System.out.println("----------------------");

        String str2 = "muattar";
        System.out.println(str2);//muattar

        str2 = str2.toUpperCase();
        System.out.println(str2);//MUATTAR

        System.out.println("--------------------------------");

        String str3 = "I live in Pittsburgh";
        System.out.println(str3);
//after re-initialising it will be replace pittsburgh to cresent
        str3 = str3.replace("Pittsburgh", "Cresent");
        System.out.println(str3);

      String str4 = "I live in Pittsburgh, I love Pittsburgh";
      str4 = str4.replaceFirst("Pittsburgh", "Cresent");
        System.out.println(str4);


        System.out.println("-------------------------------");

        String str5 = "Batch 28 students";
        String t1 = str5.substring(0,8);
        System.out.println(t1);

       String t2 =  str5.substring(str5.indexOf('s'));//for getting last word "students"
        System.out.println(t2);


        System.out.println("-------------------------");


        String name = "muATtaR";
        //name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        name = ( "" + name.charAt(0) ).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println("name = " + name);

        System.out.println(" ---------------------------------------");

        String a = "yEs";
        System.out.println(a.equals("yes"));
        System.out.println(a.equalsIgnoreCase("yes"));


        System.out.println("--------------------------------------");

        String contain = "Today we will have Java and Soft Skill classes";
        boolean hasSelenium = contain.contains("Selenium");
        System.out.println("hasSelenium = " + hasSelenium);

        boolean hasJava = contain.toLowerCase().contains("java");
        //System.out.println(contain.toLowerCase().contains("java"));
        System.out.println("hasJava = " + hasJava);


        System.out.println("--------------------------------");;







































    }

}

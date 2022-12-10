package week04_reviewString;

public class StringTaskFrequencyWord {

    public static void main(String[] args) {

        String  sentence = "Java Java Java Java Python C# Ruby C++ Swift";
        System.out.println(sentence);

       int originalLength = sentence.length();
        System.out.println(originalLength);

        String temp = sentence.replace("Java", "abc");
        System.out.println(temp);

        int tempLength = temp.length();
        System.out.println(tempLength);

        int frequencyOfJava = originalLength - tempLength;
        System.out.println(frequencyOfJava);


        System.out.println("--------------------------------------");

        String sentence1 = "Book Book Book Book Any Other Book Book Sale ";
        int originalLength1 = sentence1.length();
        System.out.println(originalLength1);

        String replace = sentence1.replace("Book", "   ");
        System.out.println(replace);

        int replaceLength = replace.length();
        System.out.println(replaceLength);

        int frequency1 = originalLength1 - replaceLength;
        System.out.println(frequency1);




        /*
         * 1. Write program that can return the fre  frequency of the "Java from a SENTENCE
         *                Ex:
         *                   sentence = "Java Java Java Java Python C# Ruby C++ Swift
         *                   output:4
         *   Do not implement any new topics(Loops, custom methods, etc)
         *
         * */


    }


}

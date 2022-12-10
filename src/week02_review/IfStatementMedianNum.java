package week02_review;

public class IfStatementMedianNum {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 20;
        boolean aIsMedian = (b > a && a > c) || (c > a && a > b);
        //in order for a to be median number between three different
        // numbers, a need to be less than b and greater c.
        // Or a need to be less than c and greater than b

        boolean bIsMedian = !aIsMedian && (c > b || c > a); //(a > b && b > c) || (c > b && b > a);
        //in order for b to be median number between three different numbers,
        // b need to be less than b and greater c.
        // Or b need to be less than c and greater than a

        boolean cIsMedian = !aIsMedian && !bIsMedian;
        // if both a and b are not a median number between three different numbers.
        //then c is different number


        if (aIsMedian ){
            System.out.println(a + " is the median number");
        }





    }

}

package week03_review;

public class IfStatement1 {

    public static void main(String[] args) {

        // Odd or Even

        int num = 100;

        if (num % 2 != 0){
            System.out.println("Odd number");
        }else{
            System.out.println("Even Number");
        }

        System.out.println(num);

        System.out.println("--------------------------");

        int month = -20;

        if (month >= 1 && month <= 12) {//if the month is valid

            if (month == 2) {
                System.out.println("28 Days");
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println("30 Days");
            } else {
                System.out.println("31 Days");
            }
        }else{// if month is NOT valid.   month < 1 or month > 12

            if (month < 1){
                System.out.println("minimum month number is 1");
            }else {
                System.out.println("maximum month number is 12");
            }

            //System.out.println("Invalid");

        }








    }


}

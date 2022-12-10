package week03_review;

public class FINRA {

    public static void main(String[] args) {

        int num = 13;
        String  result = " " ;

        // FIN, RA, FINRA, number
            if (num % 3 == 0 && num % 5 == 0) {
                result = "FINRA";
            } else if (num % 3 == 0) {
                result = "FIN";
            } else if (num % 5 == 0) {
                result = "RA";
            } else {
                result += num; // 13
            }

        System.out.println(result);




            }
        }











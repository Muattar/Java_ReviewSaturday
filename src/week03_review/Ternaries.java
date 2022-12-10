package week03_review;

public class Ternaries {

    public static void main(String[] args) {

        int day = 4;

        String dayNameResult = " ";

       /* if (day >= 1 && day <= 7) {

            dayNameResult = (day == 1) ? "Monday" : (day == 2) ? "Tuesday"
                    : (day == 3) ? "Wednesday" : (day == 4) ? "Thursday"
                    : (day == 5) ? "Friday" : (day == 6) ? "Saturday" : "Sunday";
        }else {

            dayNameResult = (day < 1)? "Minimum day num can not be less than 1"
                    : "Maximum day num can not be greater than 7";
        } */

       dayNameResult =  (day >= 1 && day <= 7)?
                  (day == 1) ? "Monday" : (day == 2) ? "Tuesday"
                : (day == 3) ? "Wednesday" : (day == 4) ? "Thursday"
                : (day == 5) ? "Friday" : (day == 6) ? "Saturday" : "Sundan"
        : "Invalid";

       System.out.println(dayNameResult);


    }


}

package week03_review;

public class DaysInWeek {

    public static void main(String[] args) {

        int day = -7;

        String dayName = "";

        if(day >= 1 && day <= 7 ){
            if (day == 1){
                dayName = "Monday";
            }else if(day == 2){
                dayName = "Tuesday";
            }else if (day == 3){
                dayName = "Wednesday";
            }else if (day == 4){
                dayName = "Thursday";
            }else if (day == 5){
                dayName = "Friday";
            }else if (day == 6){
                dayName = "Saturday";
            }else {
                dayName = "Sunday";
            }

        }else{//day is invalid
            if (day < 1){
                dayName = "Minimum day num can not be less than 1";
            }else {
                dayName = " Maximum day num can not be greater than 7";
            }


        }
        System.out.println(dayName);






    }


}

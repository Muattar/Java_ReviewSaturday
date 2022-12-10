package week01_review;

public class ifStudy {
    public static void main(String[] args) {

        int gradeLevel = 19;
        String result = "";
  if(gradeLevel <= 1 && gradeLevel <= 20){
        if(gradeLevel >= 1 && gradeLevel <= 5){
            result = "Elementary school";
        }else if(gradeLevel >= 6 && gradeLevel <= 8 ){
            result = "Middle School";
        }else if(gradeLevel >= 9 && gradeLevel <= 12){
              result = "High school";
        }else if(gradeLevel >= 13 && gradeLevel <= 16){
             result = "College";
        }else{
            result = "Grade school";
        }

        System.out.println("result = " + result);


    }else{
      result = "Inviled grade";
  }
    }

/*
*
* An integer variable named gradeLevel is declared and given, Write a
program to determine and print which school type someone is in. (Only if the given number is a valid number, then print the school type.
Otherwise print Invalid)
* Ex:
gradeLevel = 2
output:
Elementary School
The grade level and types are: 1 ~ 5: Elementary school
6 ~ 8: Middle school 9 ~ 12: High school 13 ~ 16: College
17 ~ 18: Grad School
*
* */
}

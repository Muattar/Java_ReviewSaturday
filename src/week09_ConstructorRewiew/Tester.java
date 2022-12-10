package week09_ConstructorRewiew;

import java.time.LocalDate;

public class Tester {

    public String name;
    public char gender;
    public LocalDate DOB;
    public int age;
    public String employeeId;
    public String JobTitle;
    public double salary;

    public Tester(String name){
        this.name = name;
        //JobTitle = "Unknown";
    }

    public Tester(String name, char gender) {
        this(name);
        this.gender = gender;
    }


    public Tester(String name, char gender, LocalDate DOB) {
        this(name, gender);
        this.DOB = DOB;
        age = LocalDate.now().getYear() - DOB.getYear();
    }


    public Tester(String name, char gender, LocalDate DOB, String employeeId,
                  String jobTitle, double salary) {
        this(name, gender, DOB);
        this.employeeId = employeeId;
        this.JobTitle = jobTitle;
        this.salary = salary;
    };

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", DOB=" + DOB +
                ", age=" + age +
                ", employeeId='" + employeeId + '\'' +
                ", JobTitle='" + JobTitle + '\'' +
                ", Salary=" + salary +
                '}';
    }

    public void smokeTesting(){
        System.out.println(JobTitle + " " + name + " is smoke testing");
    }

    public void creatingTicket(String ticketNumber){
        System.out.println(JobTitle + " " + name + " is creating ticket " + ticketNumber);
    }



    /*
    * Scrum Task:
	1. create a class called Tester
		    Attributes:
		        name, gender, dateOfBirth, age, employeeID, JobTitle, Salary

		    Add a constructor that can set all the fields

		    Actions:
		       smokeTesting(),  creatingTicket(), dailyStandUp() toString()

    *
    *
    * */

}

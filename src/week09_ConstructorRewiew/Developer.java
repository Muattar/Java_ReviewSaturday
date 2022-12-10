package week09_ConstructorRewiew;

import java.time.LocalDate;

public class Developer {

   public String name;
   public char gender;
   public LocalDate DOB;
   public int age;
   public String employeeID;
   public String JobTitle;
   public double salary;
   public static boolean hasProgrammingSkill = true ;

    public Developer(String name, char gender, LocalDate DOB, String employeeID, String jobTitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.DOB = DOB;
        age = LocalDate.now().getYear() - DOB.getYear();
        this.employeeID = employeeID;
        JobTitle = jobTitle;
        this.salary = salary;

    }


    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", DOB=" + DOB +
                ", age=" + age +
                ", employeeID='" + employeeID + '\'' +
                ", JobTitle='" + JobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void coding(){
        System.out.println(JobTitle + " " + name + " is coding");
    }

    public void uniteTesting(){
        System.out.println(JobTitle + " " + name + " is unit Testing the project");
    }

    public void fixingBug(){
        System.out.println(JobTitle + " " + name + " is crying");
    }



}
/*
*
* 2. create a class called Developer
	        Attributes:
	        	name, gender, dateOfBirth, age, employeeID, JobTitle, Salary

        	Add a constructor that can set all the fields

	        Actions:
	        	coding(), unitTesting(), fixingBug(), toString()

*
* */
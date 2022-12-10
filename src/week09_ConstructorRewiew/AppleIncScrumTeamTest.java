package week09_ConstructorRewiew;

import java.time.LocalDate;
import java.util.ArrayList;

public class AppleIncScrumTeamTest {

    public static void main(String[] args) {


        Tester[] testers = {new Tester("Muattar", 'F', LocalDate.of(1989, 04, 29), "A09", "SDET", 100000),
                new Tester("Cala", 'M', LocalDate.of(1988, 04, 29), "A0909", "SDET", 105000),
                new Tester("Gul", 'F', LocalDate.of(1987, 03, 27), "B0909", "SDET", 110000),
                new Tester("Bahor", 'M', LocalDate.of(1990, 8, 30), "Y7896", "SDET", 950000)};

        Developer[] developers = {new Developer("A", 'F', LocalDate.of(1988, 5, 12), "H789", "SDET", 70000),
                new Developer("Mahmut", 'M', LocalDate.of(1989, 4, 14), "3265", "Back end Developer", 120000),
                new Developer("Ediz", 'M', LocalDate.of(2001, 10, 28), "9563", "Developer", 130000),
                new Developer("Hamid", 'M', LocalDate.of(1989, 10, 10), "303", "Developer", 200000),
                new Developer("Serhan", 'M', LocalDate.of(1990, 11, 25), "308", "Developer", 160000)
        };


        ScrumTeam scrum1 = new ScrumTeam("Nazar", "Intizar", "Muattar", 14);
        scrum1.addTesters(testers);
        scrum1.addDevelopers(developers);
        //scrum1.addDeveloper(developer);
        System.out.println(scrum1);

        scrum1.removeDeveloper("9563");

        System.out.println(scrum1);

        System.out.println("------------------------------");

        for (Tester eachTester : scrum1.testers){
            System.out.println(eachTester.name + " : " + eachTester.salary);
        }

        System.out.println("-------------------------------");

        for (Developer eachDeveloper : scrum1.developers){
            System.out.println(eachDeveloper.name + " : " + eachDeveloper.salary);
        }


        System.out.println("-------------------------------------------------------------------------");


        ScrumTeam scrum2 ;


        ScrumTeam scrum3;


        System.out.println("===========================================================================");

       // ArrayList<ScrumTeam> scrum = new ArrayList<>();
      //  ScrumTeam[] scrumTeams = {scrum1, scrum2, scrum3};



/*
* 4.create a class called MyScrumTeam:
            1. create an array of Testers and add the testers from your group
            2. create an array of developers add the developers from your group
            3. create an object of ScrumTeam and store the testers & developers above to the scrum team
*
* */
    }
}

package week09_ConstructorRewiew;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam { // Scrum team HAS a developer (HAS a relation)

    public String PO, BA, SM;
    public ArrayList<Tester> testers;//for testers team
    public ArrayList<Developer> developers;//for developers team
    public int daysOfSprint;

    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
        testers = new ArrayList<>();
        developers = new ArrayList<>();

    }

    public void addTester(Tester tester){ //adds one tester to the testers team
        testers.add(tester);
    }

    public void addTesters(Tester[] testers){
       this.testers.addAll(Arrays.asList(testers));// adds multiple testers to the testers team
    }

    public void addDeveloper(Developer developer){//adds one developer to the developers team
        developers.add(developer);
    }

    public void addDevelopers(Developer[] developers){// adds multiple developers to the developers team
        this.developers.addAll(Arrays.asList(developers));
    }

    public void removeTester(String id){//remove the testers with the specified id from testers team
        testers.removeIf(p -> p.employeeId.equalsIgnoreCase(id));

    }

    public void removeDeveloper(String id){//remove the developers with the specified id from testers team
        developers.removeIf(p -> p.employeeID.equalsIgnoreCase(id));
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers=" + testers.size() +
                ", total number of developers=" + developers.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }
/*
    * 3. create a class called ScrumTeam
           	Attributes:
                  PO, BA, SM (for storing their names ONLY)
                  testers, developers, daysOfSprint

            Add a constructor that can set the PO, BA, SM and daysOfSprint

         	Actions:
                addTester(Tester tester): adds the given tester to the testers ArrayList

                addTesters(Tester[] testers): adds the given testers to the testers ArrayList

                addDeveloper(Developer developer): adds the given developer to the developers ArrayList

                addDevelopers(Developer[] developers): adds the given developers to the developers ArrayList

                removeTester(long employeeID): removes the given tester from the testers ArrayList

                removeDeveloper(long employeeID): removes the developer from the developers ArrayList

                toString(): prints number of tester,& developers,  PO name, SM name, BA name, and daysOfSprint


    *
    *
    * */




}

package week09_ConstructorRewiew;

import java.time.LocalDate;

public class BankOfAmericaTest {

    public static void main(String[] args) {

        Tester tester1 = new Tester("Muattar", 'F', LocalDate.of(1985, 4, 5)  ,"Kjf78uhy", "SDET", 90000);

        Tester tester2 = new Tester("Cala");

        Tester tester3 = new Tester("Pearls", 'F');

        Tester tester4 = new Tester("B", 'M', LocalDate.of(1989, 5, 29) );

        System.out.println(tester1);
        System.out.println(tester2);
        System.out.println(tester3);
        System.out.println(tester4);


        System.out.println("===============================================");

        Developer dev1 = new Developer("Anna", 'F', LocalDate.of(1991, 3, 8), "7HJUYG", "SDET", 100000);

        System.out.println(dev1);

        dev1.coding();
        dev1.fixingBug();
        dev1.uniteTesting();

    }

}

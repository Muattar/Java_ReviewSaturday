package week02_review;

public class Operators {

    public static void main(String[] args) {

        //Arithmetic operators: + , - , * , / , %

        System.out.println(20 / 3);

        System.out.println(20/ 3.0);

        System.out.println(169 % 20);

        System.out.println(1 + 2 + " ResultA");// first + is a addition second + is a concatination

/* System.out.println("Result A" + 0 + 1); + is here concatination
        System.out.println("Result B" + 1 + 2);
        System.out.println("Result A" + (0 + 1));
        System.out.println("Result B" + (1 + 2)); + is here addition
         */
        System.out.println("-------------------------------");
       
        //Shorthand operators: =, +=, -=, *=, /=, %=

        int a = 200;
        System.out.println("a = " + a);
        
        a = 2000;
        System.out.println("a = " + a);


        System.out.println(" ---------------------------- ");

       int x = 100;
       //x = x + 20;
       
       x += 20;// adding value to a variable on top its original value
        System.out.println("x = " + x);


        int y = 200;
        y -= 30; //200 - 30 = 170
        System.out.println("y = " + y);//170
        
        
        int score = 45;
        score *= 2;
        System.out.println("score = " + score);
        
        
        int points = 100;
        points /= 2;
        System.out.println("points = " + points);

        
        int cents = 100;
        cents -= 60;
        System.out.println("cents = " + cents);

        int quarter = cents / 25; //1
        cents -= 25;
        System.out.println("cents = " + cents);

        int nickles = cents / 5; //3
       // cents = cents % 1;
        cents %= 1;

        System.out.println("cents = " + cents);

        int amount = 730;
        int hundreds = amount / 100;

        System.out.println("hundreds = " + hundreds);

        amount %= 100;
        System.out.println("amount = " + amount);

        int tenth = amount / 10;
        System.out.println("tenth = " + tenth);

        amount %= 10; // amount = amount % 10;

        System.out.println("amount = " + amount);

        System.out.println("------------------------------");

        // Unary operators : -- , ++,

        System.out.println(-10 + 20);

        int q = 25;
        System.out.println(++q); // 26 pre increment

        int r = 50;
        System.out.println(r++); //50 post increment
        System.out.println(r);

        int t = 300;
        System.out.println(--t);// pre decrement

        int u = 300;
        System.out.println(u--); //300 post decrement




















        

    }

}

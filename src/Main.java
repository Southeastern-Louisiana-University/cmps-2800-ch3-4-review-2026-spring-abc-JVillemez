import java.util.Scanner; //Use scanner to get input from user??
public class Main {
    public static void main(String[] args) {


        //Create an instance of Scanner
        Scanner scanner = new Scanner(System.in);
        //Scanner is a class used to create an object. scanner lowercase is an instance or variable of Scanner class.
        //instead of holding a value, it holds an address that allows you to go in memory to get the info you need.




        System.out.println("Grading Program.");
        System.out.println("Provides Letter grade given number grade.");
        System.out.println("Please input a number grade: "); //We need to get this number grade into our scanner.
        double numberGrade;


        //call scanner
        //this is how you do user inputs in Java. Good to know
        numberGrade = scanner.nextDouble();


        System.out.println("Number grade is " + numberGrade);


        if(numberGrade >= 90){
            System.out.println("You get an A");
        }
        else if(numberGrade >= 80){
            System.out.println("You get a B");
        }
        else if(numberGrade >= 70){
            System.out.println("You get a C");
        }
        else if (numberGrade >= 60){
            System.out.println("You get a D");
        }
        else{
            System.out.println("I can't give your letter grade");
        }


    }
}


//HOMEWORK put this into a loop. As long as they want to enter a grade it'll stay in the loop.
//Also create a method that will take all of that, put it in a method, and call it into a main method. Done it before but totally forgot how to.

// 2/3/26 keeping it going to input more letter grades as long as we want to then stop when ready to stop.

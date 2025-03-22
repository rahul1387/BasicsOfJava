import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //For loop ---> used to run a block of code for a certain number of times.
        /*for (initialExpression; testExpression; updateExpression) {
            body of the loop
        }*/
        for (int i = 0; i<=100; i++){
           System.out.println("Hello World");
        }
        //example no2
        for (int num = 1; num <= 10; num++){
            System.out.println(num);
        }

        // While loop
        //Here's a Syntax of While loop
        /*
        initialization;
        while(condition){
        stt;
        update;
        In while loop first the condition is checked and then the code will execute, If the condition is false then the code will not execute.
         */
        int number = 1;
        while (number<=100)
        {
            System.out.println(number);
            number++;
        }

        //Do-While loop
        //Here's a Syntax of this
        /*
        do{
        //stt; ---> this will execute either the condition is true or false
        Increment or Decrement;
        }while (condition);
         */

        int j = 1;
         do {
             System.out.println(j);
             j++;
         }while (j<=10);

        //Question1

        System.out.println("This will print sum of n natural number");
        System.out.print("Enter a number:");
        int n = sc.nextInt();

        int sum = 0;
        for (int b = 1; b<=n; b++){
            sum +=b;
        }
        System.out.print("The sum of these numbers is: ");
        System.out.println(sum);

        //Examples of nested for loops
        for (int p = 0; p<3; p++)
        {
            for (int q = 0; q<3; q++)
            {
                System.out.println(p + " " + q);
            }
            System.out.println();
        }

    }
}

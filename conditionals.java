import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        //if() --> used to execute code if the given condition is true.
        //simple example
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("You can drive");
        }else{
            System.out.println("You cannot drive");
        }

        //else-if() ---> used to specify a new condition to test; if the first condition is false.
        //example
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        if(num1==num2){
            System.out.println("Both number are equal");
        }else if(num1>num2){
            System.out.println("First number is greater than second number");
        }else{
            System.out.println("First number is smaller than second number");
        }

        //Second type is Switch case
        /*
        Here's a Syntax:
        switch(variable type ke anusar){
        case 1: stt;
        break;---> this is necessary because if we didn't put break the code will execute rest all also.
        case 2: stt;
        break;
        case 3: stt;
        break;
        default: stt;
        }here's an example
         */
        System.out.print("Enter a number 1(Hello), 2(Namaste), 3(Bonjour): ");
         int button = sc.nextInt();
        System.out.print("Enter your name: ");
        String name = sc.next();


        switch (button)
        {
                case 1:
                    System.out.println("Hello " + name + "!") ;
                break;
                case 2:
                    System.out.println("Namaste " + name + "!");
                break;
                case 3:
                    System.out.println("Bonjour " + name + "!");
                break;
                default:
                    System.out.println("Invalid number!");
        }

        // Ternary operators (? , :)

    }
}

import java.util.Scanner;

public class basicSyntax { //---> class in which all the methods can be included.
    public static void main(String[] args) { //---> Main method
        System.out.println("Hello World"); // ---> Use to print output
//        For taking input from user Scanner or BufferedReader class can be used.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next(); //---> taken input can be stored in variable.
        System.out.println("Hello " + name + "!");

    }
}

public class mathOperation {
    public static void main(String[] args) {
        //Addition (+)
        int sum1 = 10 + 20; // adding two constant values
        int sum2 = sum1 + 30; // adding a variable and a constant
        int sum3 = sum1 + sum2; // adding two variables

        //Subtraction (-)
        int diff1 = 200 - 10;
        int diff2 = diff1 - 5;
        int diff3 = diff1 - diff2;

        //Multiplication (*)
        int prod1 = 10 * 20;
        int prod2 = prod1 * 2;
        int prod3 = prod1 * prod2;

        //Division (/)
        int division1 = 100/10;
        int division2 = division1 / 2;
        int division3 = division1 / division2;

        //Remainder or Modulo
        int num1 = 100;
        int remainder = num1 % 9;
        System.out.println("Remainder: " + remainder);

        // Java Math Class --> java.lang.math class in java is a toolbox for performing various calculations and provides common mathematical functions
        /*1. Math.abs() --> function which returns the absolute value of the parameter passed to it.
            The absolute value is the positive value of the parameter.If it is negative then the minus sign is removed and only integer is returned.
         */
        int abs1 = Math.abs(10);
        int abs2 = Math.abs(-20);
        System.out.println("The absolute values: " +  abs1 + "," + abs2);

        //2. Math.ceil() -->rounds a floating point value 'up' to the nearest integer value.
        //The rounded value is returned as a double.
        double ceil = Math.ceil(7.343);
        System.out.println("Integer value up of 7.343 is: " + ceil);

        //3.Math.floor() -->rounds a floating point value 'down' to the nearest integer value.
        double floor = Math.floor(7.343);
        System.out.println("Integer value down of 7.343 is: " + floor);

        //4. Math.floorDiv() --> divides one integer (int or long) by another, and rounds the result down to the nearest integer value.
        double result = Math.floorDiv(100 , 9);
        System.out.println("floorDiv() function: " + result);

        //5. Math.min() --> returns the smallest of two values passed to it as parameter
        int min = Math.min(10 , 20);
        System.out.println("min() method: " + min);

        //6. Math.max() --> returns the largest of two values passed to it as parameter.
        int max = Math.max(10 , 20);
        System.out.println("max() method: " + max);

        //7. Math.round() -->rounds a float or double to the nearest integer using normal math round rules (either up or down).
        double roundedDown = Math.round(23.445);
        double roundedUp = Math.round(23.544);
        System.out.println("roundedDown of 23.445: " + roundedDown);
        System.out.println("roundedUp of 23.544: " + roundedUp);

        //8. Math.random() --> generates a random decimal number between 0 and 1.
        double randomNumber = Math.random();
        System.out.println("random() method: " + randomNumber);



    }
}

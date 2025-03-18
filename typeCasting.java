public class typeCasting {
    public static void main(String[] args) {
        /*
        Type Casting ---> converting one data type into another.
        Two types : 1. Widening type casting --> java automatically converts one data type into another.
                    2. Narrowing type casting --> we manually convert one data type into another using the parenthesis()
         */
        // 1. Widening type casting
        int num = 10;
        System.out.println("The integer value: " + num);

        //converting into double
        double data;
        data = num;
        System.out.println("The double value: " + data);

        //2. Narrowing type casting
        double num2 = 10.99;
        System.out.println("The doubled value: " + num2);

        //converting into int using parenthesis
        int num3 = (int)num2;
        System.out.println("The integer value: " + num3);
    }
}

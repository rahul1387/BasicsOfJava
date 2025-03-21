import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        //Array declaration
        int[] arr ; //---> List of items.
        //We can create array in various data types
        String[] myArrStr = {"Rahul" , "Neeraj"};

        //Java literals
        int[] arr1 = {1,2,3,4};

        //Accessing elements in java.
        arr1[0] = 2; //Now index 0 element value has been changed by 2

        //Array length --> You can access the length of array via its length method.
        int[]  arrayLen = {12,23,34,45};
        System.out.println("The length of array is: " + arrayLen.length);

        //Iterating arrays using for loop
        int[] myArr = new int[10];
        for (int i = 0; i<myArr.length; i++){
            myArr[i] = i;
            System.out.println(myArr[i]);
        }
        //Multidimensional Arrays
        int[][] multiArr = new int[4][5];
        multiArr[0][2] = 120;
        System.out.println(multiArr[0][2]);

        //Iterating multidimensional arrays using nested for loops
        for (int i =0; i<multiArr.length; i++)
        {
            for (int j =0; j<multiArr[i].length; j++)
            {
                System.out.println("i: " + i + " j: " + j);
            }
        }
    }
}

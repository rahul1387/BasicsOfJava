import java.lang.reflect.Array;
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

        //Finding Min and Max value in arrays

        int[] nums = {1,2,32,36,55,48,77};
        int minVal = Integer.MAX_VALUE;
        for (int i =0; i<nums.length; i++){
            if(nums[i]<minVal){
                minVal = nums[i];
            }
        }
        System.out.println("minVal: " + minVal);
        //to get Max value just change the less than sign of if statement to greater than sign and change the Integer.MAX_VALUE method into Integer.MIN_VALUE

        //Copying an array to an array by using Array.copyOf() method
        int[] source = new int[10];
        for(int i =0; i<source.length; i++){
            source[i] = i;
        }
        int[] copyArr = Arrays.copyOf(source,source.length);
        //using copyOfRange()
        int[] copyArr2 = Arrays.copyOfRange(source, 0 , source.length);

        //Arrays.toString() ---> used to convert arrays into strings
        System.out.println("Array into String: " + Arrays.toString(copyArr));

        //Sorting arrays by using Arrays.sort() method
        int[] myArr2 = new int[10];
        for(int i = 0; i < myArr2.length; i++){
            myArr2[i] = 10 - i;
        }
        System.out.println("Before sorting: "+Arrays.toString(myArr2));
        Arrays.sort(myArr2);
        System.out.println("After sorting: "+Arrays.toString(myArr2));

        //Filling Arrays with Arrays.fill() method
        int[] fillArr = new int[10];
        Arrays.fill(fillArr , 12);

        System.out.println("Filled array: " + Arrays.toString(fillArr));

        //Searching arrays using Arrays.binarySearch()
        int[] ints = {0,2,4,6,8,10};

        int index = Arrays.binarySearch(ints, 10);

        System.out.println(index);

        //Checking if Arrays are Equal with Arrays.equals()
        int[] numArr1 = {1,2,3};
        int[] numArr2 = {1,2,23};
        int[] numArr3 = {1,2,3};

        boolean numArr1EqualsnumArr2 = Arrays.equals(numArr1,numArr2);
        boolean numArr1EqualsnumArr3 = Arrays.equals(numArr1,numArr3);

        System.out.println(numArr1EqualsnumArr2);
        System.out.println(numArr1EqualsnumArr3);
    }
}

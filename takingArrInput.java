import java.util.Arrays;
import java.util.Scanner;

public class takingArrInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter element1 of array: ");
        int element1 = input.nextInt();
        System.out.print("Enter element2 of array: ");
        int element2 = input.nextInt();
        System.out.print("Enter element3 of array: ");
        int element3 = input.nextInt();
        System.out.print("Enter element4 of array: ");
        int element4 = input.nextInt();
        System.out.print("Enter element5 of array: ");
        int element5 = input.nextInt();

        int[] arr = {element1,element2,element3,element4,element5};

        System.out.println(Arrays.toString(arr));
    }
}

import java.util.*;

public class lararr {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the 5 elements in an array :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num.nextInt();
        }
        System.out.println("Your elements in an array :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        num.close();
    }
}

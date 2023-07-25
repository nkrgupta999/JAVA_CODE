import java.util.*;

public class oneton {
    public static void main(String[] args) {
        Scanner on = new Scanner(System.in);
        System.out.println("Enter the integer number to print upto your number :");
        int num = on.nextInt();
        int i = 1;
        while (i <= num) {
            System.out.println("Value in " + i + " loop is : " + i);
            i++;
        }
        on.close();

    }
}

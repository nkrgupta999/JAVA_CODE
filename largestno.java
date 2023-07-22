import java.util.*;

public class largestno {
    public static void main(String[] args) {
        Scanner no = new Scanner(System.in);
        System.out.println("Enter the two integer no for find the largest number");
        long a = no.nextLong();
        long b = no.nextLong();
        if (a > b) {
            System.out.println("The Value of a is largest : " + a);
        } else {
            System.out.println("The Value of b is largest :" + b);
        }
        no.close();
    }

}

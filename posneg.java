import java.util.*;

public class posneg {
    public static void main(String[] args) {
        Scanner pn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = pn.nextInt();
        if (num >= 1) {
            System.out.println("Your number is positive");
        } else if (num == 0) {
            System.out.println("Your number is zero");
        } else {
            System.out.println("Your number is negative");
        }
        pn.close();

    }

}

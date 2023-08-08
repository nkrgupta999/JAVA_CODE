import java.util.*;

public class GCD {
    public static int findgcd(int a, int b) {
        if (b == 0)
            return a;

        return findgcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number for finding the GCD ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number for finding the GCD ");
        int b = sc.nextInt();
        sc.close();
        int gcd = findgcd(a, b);
        System.out.println("The GCD of your value is : " + gcd);

    }

}
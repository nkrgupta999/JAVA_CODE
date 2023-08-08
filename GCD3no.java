import java.util.*;

public class GCD3no {
    public static int findgcd(int a, int b) {
        if (b == 0)
            return a;
        return findgcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number :");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number :");
        int b = sc.nextInt();
        System.out.println("Enter the 3rd number :");
        int c = sc.nextInt();
        sc.close();
        int gcd = findgcd(a, findgcd(b, c));
        System.out.println("Your GCD of three number is : " + gcd);
    }
}

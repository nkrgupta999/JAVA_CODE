import java.util.*;

public class avg3no{

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        double avg;
        System.out.println("Enter the 3 Doubleeger value:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        avg = a + b + c / 3;
        System.out.println("Average is :" + avg);
        sc.close();
    }
}

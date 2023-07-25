import java.util.*;

public class sumton {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        System.out.println("Enter the number for upto  your number sum");
        int sum = 0, i = 1;
        int num = sm.nextInt();
        while (i <= num) {
            sum = sum + i;
            System.out.println("In " + i + " Loop sum value is : " + sum);
            i++;
        }
        sm.close();
    }
}

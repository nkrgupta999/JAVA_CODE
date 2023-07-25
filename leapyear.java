import java.util.*;

public class leapyear {
    public static void main(String args[]) {
        Scanner ly = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = ly.nextInt();
        if (year / 4 == 0 && year / 100 == 0 && year / 400 == 0) {
            System.out.println(year + " is a leap Year ");
        } else {
            System.out.println(year + " is not a leap Year ");
        }
        ly.close();
    }
}

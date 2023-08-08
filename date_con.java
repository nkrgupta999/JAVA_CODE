import java.util.*;
import java.text.*;

public class date_con {
    public static void main(String[] args) {
        Scanner dc = new Scanner(System.in);
        System.out.println("Enter the hour");
        int hour = dc.nextInt();
        int min = 0, sec = 0;
        if (hour <= 12) {
            System.out.println("Enter the min ");
            min = dc.nextInt();
            if (min <= 60) {
                System.out.println("Enter sec");
                sec = dc.nextInt();
                System.out.println("Your entered time is :- " + hour + ":" + min + ":" + sec);
            } else {
                System.out.println("Enter the time in 12-hrs format");
            }
        } else {
            System.out.println("Enter the time in 12-hrs format");
        }
        dc.close();
    }
}
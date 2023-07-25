import java.util.*;

public class dayname {
    public static void main(String[] args) {
        Scanner dn = new Scanner(System.in);
        System.out.println("Enter the day number in a week ");
        int day_no = dn.nextInt();
        switch (day_no) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("INVALID DAY NO !\n PLEASE TRY AGAIN");

        }

        dn.close();
    }

}

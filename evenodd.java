import java.util.*;

public class evenodd {
    public static void main(String[] args) {
        Scanner evod = new Scanner(System.in);
        System.out.println("Enter the no for checking is even or odd :");
        int no = evod.nextInt();
        if (no % 2 == 0) {
            System.out.println("No. is even ");
        } else {
            System.out.println("No. is odd ");
        }
        evod.close();
    }

}

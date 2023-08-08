
//    ******
//     ******
//      ******
//       ******
import java.util.*;

public class pattern4 {
    public static void main(String[] args) {
        Scanner no = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int n = no.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 4; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
        no.close();
    }
}

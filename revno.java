import java.util.*;

public class revno {
    public static void main(String[] args) {
        Scanner rn = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse :");
        int num = rn.nextInt();
        while (num > 0) {
            int lst_dig = num % 10;
            System.out.print(lst_dig);
            num = num / 10;
        }
        System.out.println("");
        rn.close();
    }

}

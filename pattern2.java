        //    ******
        //    ******
        //    ******
        //    ******
import java.util.*;
public class pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number of rows : ");
        int row =sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<6;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}

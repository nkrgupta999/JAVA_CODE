import java.util.*;
public class hello{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 2 number for sum :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c= a+b;
        System.out.println("Addition is :"+c);
        sc.close();
    }
}
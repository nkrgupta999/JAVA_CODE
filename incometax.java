import java.util.*;

public class incometax {
    public static void main(String args[]) {
        Scanner sal = new Scanner(System.in);
        System.out.println("Enter you income");
        double income = sal.nextDouble();
        if (income <= 500000) {
            System.out.println("Your Income is Less Than 5Lakh");
            System.out.println("You have to pay 0 % tax on Your income");
        } else if (income >= 500000 && income <= 1000000) {
            System.out.println("Your Income between 5 Lakh to 10 lakh");
            System.out.println("You have to pay 20 % tax on Your income");
            double new_income = income + (income * 0.20);
            System.out.println("You have to pay : " + new_income);
        } else {
            System.out.println("Your income is higher than 10 lakh ");
            System.out.println("You have to pay 30 % tax on Your income");
            double n_income = income + (income * 0.30);
            System.out.println("You have to pay :" + n_income);
        }
        sal.close();
    }
}

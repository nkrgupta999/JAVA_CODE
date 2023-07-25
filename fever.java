import java.util.*;

public class fever {
    public static void main(String[] args) {
        Scanner fv = new Scanner(System.in);
        System.out.println("Enter your Boddy temperature in celcius :");
        double temp = fv.nextDouble();
        if (temp > 100) {
            System.out.print("\nYou are suffering from Fever.");
        } else {
            System.out.println("You are not suffering from Fever ");
        }
        fv.close();
    }

}

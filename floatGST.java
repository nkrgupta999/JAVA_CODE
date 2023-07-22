import java.util.*;

public class floatGST {
    public static void main(String args[]) {
        Scanner pr = new Scanner(System.in);
        System.out.println("Enter the price of Pen");
        float pen = pr.nextFloat();
        System.out.println("Enter the price of Pencil");
        float pencil = pr.nextFloat();
        System.out.println("Enter the price of Eraser");
        float eraser = pr.nextFloat();
        double Total_Bill_Amount = pen + pencil + eraser;
        System.out.println("Total Bill Amount is (without GST): " + Total_Bill_Amount);
        System.out.println("Can U add GST (Y/N) : ");
        char ans = pr.next().charAt(0);
        if (ans == 'Y' || ans == 'y') {
            System.out.println("Add 18% GST on your Bill ");
            double New_Total_Bill_Amount = Total_Bill_Amount * 0.18;
            double gstamt = New_Total_Bill_Amount + Total_Bill_Amount;
            System.out.println("Total Bill Amount is (with GST): " + gstamt);
        } else {
            System.out.println("Total Bill Amount is : " + Total_Bill_Amount);
        }
        pr.close();

    }
}

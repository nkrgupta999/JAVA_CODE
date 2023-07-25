import java.util.*;

public class result {
    public static void main(String[] args) {
        Scanner pf = new Scanner(System.in);
        System.out.println("Enter the marks of Statistics subject :");
        double sts = pf.nextDouble();
        System.out.println("Enter the marks of Data Structure subject :");
        double ds = pf.nextDouble();
        System.out.println("Enter the marks of System Design Analysing subject: ");
        double sd = pf.nextDouble();
        double total = ((sd + ds + sts) / 300) * 100;
        if (total >= 33) {
            System.out.println("You Passed the exam !\n -----Best Luck for Your Future----------");
        } else {
            System.out.print("-----Sorry!-----\n You Failed in Examination.\nPlease try again");
        }
        pf.close();
    }
}

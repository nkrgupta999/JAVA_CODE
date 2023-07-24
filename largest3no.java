import java.util.*;

public class largest3no {
    public static void main(String args[]) {
        Scanner lg = new Scanner(System.in);
        int f_no, s_no, t_no;
        System.out.println("Enter the three Integer number : ");
        f_no = lg.nextInt();
        s_no = lg.nextInt();
        t_no = lg.nextInt();
        if (f_no > s_no && f_no > t_no) {
            System.out.println("Value of fisrt variable is largest integer" + f_no);
        } else if (s_no > t_no && s_no > f_no) {
            System.out.println("Value of Second variable is largest Integer" + s_no);
        } else if (s_no < t_no && f_no < t_no) {
            System.out.println("Value of third  variable is largest Integer" + t_no);
        } else if (s_no == f_no && f_no == t_no) {
            System.out.println("All Value are Same\nUse Different Value of Finding Largest Integer");
        } else if (f_no == t_no && f_no != s_no) {
            System.out.println("Two value are same but one value is different\n So,Use all differnt Value");
        } else if (f_no == s_no && f_no != t_no) {
            System.out.println("Two value are same but one value is different\n So,Use all differnt Value");
        } else if (s_no == t_no && f_no != s_no) {
            System.out.println("Two value are same but one value is different\n So,Use all differnt Value");
        } else {
            System.out.println("INVALID CONDITION");
        }
        lg.close();
    }
}

import java.util.*;

public class areasq {
    public static void main(String args[]) {
        Scanner arc = new Scanner(System.in);
        double area, side;
        System.out.print("Enter the side of Square :");
        side = arc.nextDouble();
        area = side * side;
        System.out.println("Area of circle is : " + area);
        arc.close();
    }

}

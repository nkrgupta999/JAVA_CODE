import java.util.*;

public class areacircle {
    public static void main(String args[]) {
        Scanner ar = new Scanner(System.in);
        double r, areacircle;
        double pie = 3.14;
        System.out.println("Enter the radius of the circle : ");
        r = ar.nextDouble();
        if (r < 0) {
            System.out.println("Radius id not in Minus \nEnter Valid Radius");
        } else {
            areacircle = pie * r * r;
            System.out.println("Area of a Circle is :" + areacircle);
        }
        ar.close();

    }
}

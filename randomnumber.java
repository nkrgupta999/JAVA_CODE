import java.util.*;

public class randomnumber {
    public static void main(String[] args) {
        int min_num = 1, max_num = 10000;
        // Message Printing
        System.out.println("-----------------------RANDOM NUMBER GENERATING------------------");
        // RANDOM OBJECT
        Random rand_num = new Random();
        // Generate random number within the range
        int ran_num = rand_num.nextInt(max_num - min_num + 1) + min_num;
        // Priting the Random Number Generator
        System.out.println("Your random number between 1 to 10000 is : " + ran_num);

    }
}
import java.util.*;

public class guessnumber {
    public static int gen_rnd_num(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static void main(String[] args) {
        Scanner gn = new Scanner(System.in);
        int gen_num = gen_rnd_num(1, 100);
        int chances = 0;
        int x, y;
        System.out.println("Enter the 1st value for starting the game : ");
        x = gn.nextInt();
        System.out.println("Enter the 2nd value for ending the game : ");
        y = gn.nextInt();
        System.out.println("--------->Let's Start to guessing the number<----------");
        System.out.println("we have Generated a number between " + x + " and " + y);
        int guess;
        do {
            System.out.println("Enter your guess : ");
            guess = gn.nextInt();
            chances++;
            if (gen_num < guess) {
                System.out.println("You Guess Is To High!\n TRY AGAIN------");
            } else if (gen_num > guess) {
                System.out.println("Your Guess Is To Low!\n TRY AGAIN------");
            } else {
                System.out.println("CONGARTULATIONS! You Guessed Correct Number ");
                System.out.println("Total Attempt : " + chances);
            }
        } while (guess != gen_num);
        gn.close();
    }
}

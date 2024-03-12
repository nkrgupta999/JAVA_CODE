public class Largestnumber {
    public static void largest(int num[]) {
        int large = Integer.MIN_VALUE; // set initial value to the smallest possible integer
        for (int i = 0; i < num.length; i++) {
            if (large < num[i]) {
                large = num[i];
            }

        }
        System.out.println("largest elemnt in array is :" + large);
    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 85, 200 };
        largest(num);
    }

}

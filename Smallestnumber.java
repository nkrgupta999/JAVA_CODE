public class Smallestnumber {
    public static void smallest(int num[]) {
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (small > num[i]) {
                small = num[i];
            }
        }
        System.out.println("Smallest number in an arry is " + small);
    }

    public static void main(String[] args) {
        int num[] = { 11, 22, 45, 84, 1, 54, 62, 14, 100 };
        smallest(num);
    }
}

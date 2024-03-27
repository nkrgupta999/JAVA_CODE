public class KadanesAlgo {
    public static void kadanes(int arr[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < arr.length; i++) {
            cs = cs + arr[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Max SubArray Sum: " + ms);
    }

    public static void main(String[] args) {
        int arr[] = { -2, 1, -3, 2, -4, 4, 5, -21 };
        kadanes(arr);
    }
}

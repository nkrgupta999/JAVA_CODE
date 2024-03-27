public class ReverseArray {
    public static void reverse(int num[]) {
        int start = 0;
        int end = num.length - 1;
        while (start < end) {
            int temp = num[end];
            num[end] = num[start];
            num[start] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 1, 56, 35, 97, 100 };
        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}

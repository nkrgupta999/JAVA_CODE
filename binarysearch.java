public class binarysearch {
    public static int search(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12 };
        int key = 10;
        int index = search(arr, key);
        if (index == -1) {
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Element is present in array at index " + index);
        }
    }
}

public class LinearSea {
    public static void search(String arr[], String Key) {
        for (int i = 0; i < arr.length; i++) {
            if (Key == arr[i]) {
                System.out.println("Element is found in " + i + " index");
            }

        }

    }

    public static void main(String[] args) {
        String arr[] = { "Mango", "Banana", "Apple", "PineApple", "Pine" };
        String key = "PineApple";
        search(arr, key);
    }

}


public class revaar {
    public static void printarr(int arr[]){
            int temp;
            for (int i = 0; i < arr.length / 2; i++) {
                int swapIndex = arr.length - i - 1;
                temp = arr[i];
                arr[i] = arr[swapIndex];
                arr[swapIndex] = temp;
            }
            for (int j = 0; j < arr.length; j++){
                System.out.println(arr[j] + "");
            }
        }

    public static void main(String[] args){
            int arr[] = { 1, 2, 3, 4, 5};
            printarr(arr);
            {
        }
    
    }
}

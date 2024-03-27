// import java.util.*;

public class LinearSearch {
    public static int lineraSearch(int num[], int key) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i; // return the index of the element in array if it is found
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 7, 2, 1, 55 };
        int key = 7;
        int index = lineraSearch(num, key);
        if (index == -1) {
            System.out.println("Elemet is Not Found");
        } else {
            System.out.println("Element is found at :" + index + " position");

        }
    }
}
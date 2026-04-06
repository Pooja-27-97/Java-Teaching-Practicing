import java.util.*;

public class Array {
    public static int printLargest(int arr[]) {
        int large = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                large = arr[i];
            }
        }
        return large;
    }

    public static int printSmallest(int arr[]) {
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) {
                small = arr[i];
            }
        }
        return small;
    }

    public static void main(String args[]) {
        int arr[] = { 4, 5, 8, 16, 25, 178, 102 };

        System.out.println("Largest elt: " + printLargest(arr));
        System.out.println("Smallest elt: " + printSmallest(arr));
    }
}

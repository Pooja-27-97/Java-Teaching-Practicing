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

    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key)
                return mid;
            if (arr[mid] < key)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }

    public static void reverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void printPairs(int arr[]) {
        int pairs = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
                pairs++;
            }
            System.out.println();
        }
        System.out.println("Pairs: " + pairs);
    }

    public static void printSubArray(int arr[]) { // O(n^3)
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                sum = 0;
                for (int k = start; k <= end; k++) {
                    // System.out.print(arr[k] + ", ");
                    sum += arr[k];
                }
                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println("Max: " + max);
    }

    public static void prefixSubArray(int arr[]) { // O(n^2)
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (sum > max)
                    max = sum;
            }
        }
        System.out.println("Max: " + max);
    }

    public static void kadens(int arr[]) { // O(n)
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum < 0)
                sum = 0;
            max = Math.max(sum, max);
        }
        System.out.println("Max: " + max);
    }

    public static void main(String args[]) {
        int arr[] = { -3, -2, 4, -1, 5 };

        // System.out.println("Largest elt: " + printLargest(arr));
        // System.out.println("Smallest elt: " + printSmallest(arr));

        // int index = linearSearch(arr, 18);
        // if (index == -1) {
        // System.out.println("Not found!");
        // } else {
        // System.out.println("Element fount at " + index);
        // }

        // int index = binarySearch(arr, 25);
        // if (index == -1) {
        // System.out.println("Not found!");
        // } else {
        // System.out.println("Element fount at " + index);
        // }

        // reverse(arr);
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
        // System.out.println();

        // printPairs(arr);
        // printSubArray(arr);
        // prefixSubArray(arr);
        kadens(arr);
    }
}

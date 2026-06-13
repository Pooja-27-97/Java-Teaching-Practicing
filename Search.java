public class Search {
    public static int LinearSearch(int marks[], int key) {
        for(int i=0; i < marks.length; i++) {
            if(marks[i] == key) return i;
        }
        return -1;
    }

    public static int BinarySearch(int marks[], int key) {
        int start = 0;
        int end = marks.length - 1;

        while(end >= start) {
            int mid = (start + end)/2;
            if (marks[mid] == key) return mid;
            else if (marks[mid] > key) end = mid-1;
            else start = mid+1;
        }
        return -1;
    }

    public static void ReverseArray(int marks[]) {
        int start = 0;
        int end = marks.length - 1;

        while(start <= end) {
            int temp = marks[start];
            marks[start] = marks[end];
            marks[end] = temp;
            start++;
            end--;
        }
        printArray(marks);
    }

    public static void printArray(int marks[]) {
        for(int i=0; i <= marks.length-1; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }

    public static void ArrayPair(int marks[]) {
        int count = 0;
        for(int i=0; i < marks.length; i++) {
            for(int j = i+1; j < marks.length; j++) {
                System.out.print(" ("+ marks[i] + "," + marks[j] + ") ");
                count++;
            }
            System.out.println();
        }
        System.out.println("Total count: " + count);
    }

    public static void SubArray(int marks[]) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i < marks.length; i++) {
            for(int j = i; j < marks.length ; j++) {
                int sum = 0;
                for(int k = i; k <= j; k++) {
                    System.out.print(marks[k] + ",");
                    sum += marks[k];
                }
                System.out.print("    ");
                if(sum > max) max = sum;
            }
            System.out.println();
        }
        System.out.println("Total Sum: " + max);
    }

    public static void PrefixArray(int arr[]) {
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        for(int i=1; i <= arr.length-1; i++) {
            prefix[i] = prefix[i-1] + arr[i];
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

    public static void Kadanes(int marks[]) {
        int max = Integer.MIN_VALUE;
        int sum =0;

        for(int i=0; i < marks.length ; i++) {
            sum += marks[i];
            if(sum < 0) sum = 0;
            if(sum > max) max = sum;
        }
        System.out.println("Sum: " + sum);
    }
    public static void main(String args[]) {
        int marks[] = {5, 8, -10, -12, 18, -20, 27};
        // System.out.println(LinearSearch(marks, 20));
        // System.out.println(BinarySearch(marks, 9));
        // printArray(marks);
        // ReverseArray(marks);
        // ArrayPair(marks);
        // SubArray(marks);
        // PrefixArray(marks);
        // Kadanes(marks);
    }
}
public class Sorting {
    public static void bubbleSort(int elts[]) {
        for (int i = 0; i < elts.length - 1; i++) {
            for (int j = 0; j < elts.length - 1 - i; j++) {
                if (elts[j] > elts[j + 1]) {
                    int temp = elts[j];
                    elts[j] = elts[j + 1];
                    elts[j + 1] = temp;
                }
            }
        }
        printArray(elts);
    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j])
                    minPos = j;
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int elts[] = { 5, 4, 1, 3, 2 };
        // bubbleSort(elts);
        selectionSort(elts);
    }
}
public class Sorting {
    public static void bubbleSort(int elts[]) {
        for(int i=0; i < elts.length - 1; i++) {
            for(int j=0; j < elts.length - 1 - i; j++) {
                if(elts[j] > elts[j+1]) {
                    int temp = elts[j];
                    elts[j] = elts[j+1];
                    elts[j+1] = temp;
                }
            }
        }
        printArray(elts);
    }

    public static void selectionSort(int elts[]) {
        for(int i=0; i < elts.length - 1; i++) {
            int minPos = i;
            for(int j=i+1; j < elts.length; j++) {
                if(elts[minPos] > elts[j]) minPos = j;
            }
            int temp = elts[minPos];
            elts[minPos] = elts[i];
            elts[i] = temp;
        }
        printArray(elts);
    }

    public static void insertionSort(int elts[]) {
        for(int i=1; i < elts.length; i++) {
            int curr = elts[i];
            int pre = i-1;

            while(pre >= 0 && elts[pre] > curr) {
                elts[pre+1] = elts[pre];
                pre--;
            }

            elts[pre+1] = curr;
        }
        printArray(elts);
    }

    public static void countSort(int elts[]) {
        int largest = Integer.MIN_VALUE;

        for(int i=0; i < elts.length; i++) {
            if(elts[i] > largest) largest = elts[i];
        }

        int count[] = new int[largest+1];
        for(int i=0; i < elts.length; i++) {
            count[elts[i]]++;
        }

        int j=0;
        for(int i=0; i < count.length; i++) {
            while(count[i] > 0) {
                elts[j] = i;
                j++;
                count[i]--;
            }
        }
        printArray(elts);
    }

    public static void printArray(int elts[]) {
        for(int i=0; i < elts.length; i++) {
            System.out.print(elts[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // int elts[] = { 5, 4, 1, 3, 2 , 7, 6};
        int elts[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        // bubbleSort(elts);
        // selectionSort(elts);
        // insertionSort(elts);
        countSort(elts);
    }
}
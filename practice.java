import java.util.*;

public class practice {
    public static void printHello() {
        System.out.println("Hello!");
    }

    public static void printSum(int a, int b) {
        int result = a + b;
        System.out.println("Sum: " + result);
    }

    public static int printSum(int a, int b, int c) {
        int sum = (a + b + c);
        return sum;
    }

    public static float printSum(float a, float b) {
        return (a + b);
    }

    public static void main(String[] args) {
        System.out.println("Created a function");
        printHello();
        printSum(10, 20);
        System.out.println(printSum(100.24f, 20.49f));
        int sum = printSum(5, 20, 10);
        System.out.println(sum);
    }
}
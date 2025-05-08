import java.util.Scanner;

public class Main {
    public static void printArray(int[] arr) {
        for (int term : arr) {
            System.out.print(term + " ");
        }
        System.out.println();
    }

    public static void sumOfArray(int[] arr, int size) {
        int sum = 0;
        for (int ind = 0; ind < size; ind++) {
            sum += arr[ind];
        }
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        for (int ind = 0; ind < size; ind++) {
            arr[ind] = ind + 1;
        }

        printArray(arr);
        sumOfArray(arr, size);
    }
}

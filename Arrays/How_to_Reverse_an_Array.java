package Arrays;

import java.util.Scanner;

public class How_to_Reverse_an_Array {
    public static void main(String[] args) {
        System.out.println("Enter the size of Array:- ");
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int arr[] = new int[T];
        System.out.println("Enter the values:- ");
        for (int i = 0; i < T; i++) {
            arr[i] = sc.nextInt();
        }   
        
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println("Reverse of the array is:- ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
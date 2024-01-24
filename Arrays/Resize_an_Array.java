package Arrays;

import java.util.Scanner;

public class Resize_an_Array {
    public static void main(String[] args) {
        System.out.println("Enter the size of Array:- ");
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int arr[] = new int[T];
        System.out.println("Enter the values:- ");
        for (int i = 0; i < T; i++) {
            arr[i] = sc.nextInt();
        }   
        
        System.out.println("Enter the new size of and array:- ");
        int capacity=sc.nextInt();
        int arr1[]=new int[capacity];

        for(int i=0; i<arr.length; i++){
            arr1[i]=arr[i];
        }

        System.out.println("Array after resize is:- "); 
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
        
        System.out.println("\nSize of array after resize an array= "+arr1.length);
    }
}

package Arrays;

import java.util.Scanner;

public class Copy_Array {
    public static void main(String[] args) {
        System.out.println("Enter the size of Array:- ");
        Scanner sc =new Scanner(System.in);
        int T= sc.nextInt();

        int arr[] =new int[T];
        System.out.println("Enter the the values:- ");
        for(int i=0; i<T; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("The Given Array is:- ");
        for(int i=0; i<T;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        System.out.println("Copied Array is:- ");
        int arr1[]=new int[T];
        for(int i=0; i<T; i++){
            arr1[i]=arr[i];
        }

        for(int i=0; i<T;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}

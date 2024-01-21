package Arrays;

import java.util.Scanner;

public class Remove_Even_Integers_from_an_Array {
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

        int odd=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2!=0){
                odd++;
            }
        }

        int arr1[]=new int[odd];
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2!=0){
                arr1[count]=arr[i];
                count++;
            }
        }
        System.out.println();
        System.out.println("Remove_Even_Integers_from_an_Array:- ");
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
    }
}

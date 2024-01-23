package Arrays;

import java.util.Scanner;

public class Find_Minimum_value_in_an_Array {
    public static void main(String[] args) {
        System.out.println("Enter the size of Array:- ");
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int arr[] = new int[T];
        System.out.println("Enter the values:- ");
        for (int i = 0; i < T; i++) {
            arr[i] = sc.nextInt();
        }   
        
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum Value From Array is:- "+ min); 
    }
}

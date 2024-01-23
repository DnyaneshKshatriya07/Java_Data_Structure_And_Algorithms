package Arrays;

import java.util.Scanner;

public class Find_Second_Maximum_value_in_an_Array {
    public static void main(String[] args) {
        System.out.println("Enter the size of Array:- ");
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int arr[] = new int[T];
        System.out.println("Enter the values:- ");
        for (int i = 0; i < T; i++) {
            arr[i] = sc.nextInt();
        }   
        
        int max=Integer.MIN_VALUE;//MIN_VALUE+=> -2147483648
        int secondMax=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            }
            else if(arr[i]>secondMax && arr[i] !=max){
                secondMax=arr[i];
            }
        }
        System.out.println("Second Maximum Value From Array is:- "+ secondMax); 
    }
}

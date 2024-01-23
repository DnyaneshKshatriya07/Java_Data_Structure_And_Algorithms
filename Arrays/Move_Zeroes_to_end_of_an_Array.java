package Arrays;

import java.util.Scanner;

public class Move_Zeroes_to_end_of_an_Array {
    public static void main(String[] args) {
        System.out.println("Enter the size of Array:- ");
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int arr[] = new int[T];
        System.out.println("Enter the values:- ");
        for (int i = 0; i < T; i++) {
            arr[i] = sc.nextInt();
        }   
        
        int j=0;
        for(int i=0; i<T; i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
        System.out.println("Output Array is:- "); 
        for(int i=0; i<T; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

package Arrays;

import java.util.Scanner;

public class Delete_Array {
    public static void main(String[] args) {
        System.out.println("Enter the size of Array:- ");
        Scanner sc =new Scanner(System.in);
        int T= sc.nextInt();

        int arr[] =new int[T];
        System.out.println("Enter the the values:- ");
        for(int i=0; i<T; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the index of element that you want to delate:- ");

        int position=sc.nextInt();
        System.out.println("Array after deleting the element is:- ");
        
        for(int i=position; i<T-1; i++){
            arr[i]=arr[i+1];
        }

        for(int i=0; i<T-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

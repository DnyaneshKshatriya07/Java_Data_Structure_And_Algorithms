package Arrays;

import java.util.Scanner;

public class Adding_and_Updating_of_Array{
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
        System.out.println("Can you Update the Array(yes=>1 / no=>0):- ");
        int ans=sc.nextInt();
        
        if(ans==1){
            System.out.print("Give the index no. where you want to update:- ");
            int index= sc.nextInt();
            for(int i=0; i<T; i++){
                if(i==index){
                    System.out.println("Enter the updated value:- ");
                    int update=sc.nextInt();
                    arr[index]=update;
                }
            }
            System.out.println("The Given Array is:- ");
            for(int i=0; i<T;i++){
                System.out.print(arr[i]+" ");
            }
        }
        else{
            System.out.println("Thank You");
        }
    }
}
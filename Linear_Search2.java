/*
Linear Search Algorithm
Output is in the form of index of search element.
*/
package Java_Data_Structure_And_Algorithms;

import java.util.Scanner;

public class Linear_Search2 {
    public static void main(String[] args) {
        int flag = -1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:- ");
        int a= sc.nextInt();
        int [] arr= new int[a];
        System.out.println("Enter the values:- ");
        for(int i=0; i< arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter The Search Value:- ");
        int n= sc.nextInt();

        for(int i=0; i<arr.length; i++){
            if(arr[i]==n){
                flag=i;
                break;
            }
        }
        System.out.println("Index of that value is "+flag);
    }
}

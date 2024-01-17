package Java_Data_Structure_And_Algorithms;

/*
Linear Search Algorithm
1St Way=> Output is in the form of element is found or not.
*/

import java.util.Scanner;

public class Linear_Search1{
   public static void main(String[] args) {
       boolean flag = false;
       Scanner sc=new Scanner(System.in);
       int [] arr= {10, 27, 26, 64, 37, 72, 87, 34, 50, 100, 23, 89, 9, 7, 45};
       System.out.println("Enter The Search Value:- ");
       int n= sc.nextInt();

       for(int i=0; i<arr.length; i++){ //if we have to find only element is found or not we can use enhance for loop because in enhance for loop there will be no any indexes are used.
           if(arr[i]==n){
               flag=true;
               break;
           }
       }
       if(flag){
           System.out.println("Value present in given array");
       }
       else{
           System.out.println("Value is not present in given array");
       }
   }
}


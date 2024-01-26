package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Insert_Array {

    public static void main(String[] args) {
        System.out.println("Enter the size of Array:- ");
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        
        int i;
        int arr[] =new int[n];
        System.out.println("Enter the the values:- ");
        for(i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        

        System.out.println("Initial Array:\n" + Arrays.toString(arr));

        System.out.println("Enter the value to insert:- ");
        int value=sc.nextInt();
        
        System.out.println("Enter the position where you want to insert the element:- ");
        int position=sc.nextInt();

        int newarr[] = new int[n + 1];

        for (i = 0; i < n + 1; i++) {
            if (i < position - 1)
                newarr[i] = arr[i];
            else if (i == position - 1)
                newarr[i] = value;
            else
                newarr[i] = arr[i - 1];
        }

        System.out.println("output is:- ");
        for(i=0; i<n+1; i++){
            System.out.print(newarr[i]+" ");
        }
    }
}

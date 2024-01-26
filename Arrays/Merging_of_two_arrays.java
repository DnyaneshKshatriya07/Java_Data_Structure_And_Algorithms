package Arrays;

import java.util.Scanner;

public class Merging_of_two_arrays {

    public static void main(String[] args) {
        System.out.println("Enter the size of 1st Array:- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i, j, k;
        int arr1[] = new int[n];
        System.out.println("Enter the the values:- ");
        for (i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the size of 2nd Array:- ");
        int m = sc.nextInt();

        int arr2[] = new int[m];
        System.out.println("Enter the the values:- ");
        for (i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        i = 0;
        j = 0;
        k = 0;

        int res[] = new int[n + m];
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                res[k] = arr1[i];
                i++;
                k++;
            } else {
                res[k] = arr2[j];
                k++;
                j++;
            }
        }

        while (i < n) {
            res[k] = arr1[i];
            i++;
            k++;
        }

        while (j < m) {
            res[k] = arr2[j];
            k++;
            j++;
        }    

        System.out.println("Resultant array is:- ");
        for(i=0; i<n+m;i++){
            System.out.print(res[i]+" ");
        }
    }
}

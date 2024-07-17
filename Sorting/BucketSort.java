package Java_Data_Structure_And_Algorithms.Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    // Function to sort arr[] using bucket sort
    public static void bucketSort(float[] arr) {
        int n = arr.length;
        if (n <= 0) {
            return;
        }

        // Create n empty buckets
        @SuppressWarnings("unchecked")
        ArrayList<Float>[] buckets = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Put array elements in different buckets
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) (n * arr[i]); // Index in bucket
            buckets[bucketIndex].add(arr[i]);
        }

        // Sort individual buckets
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        // Concatenate all buckets into arr[]
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (Float value : buckets[i]) {
                arr[index++] = value;
            }
        }
    }

    // Function to print the array
    public static void printArray(float[] arr) {
        for (float value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Main method to test the bucket sort algorithm
    public static void main(String[] args) {
        float[] arr = {0.897f, 0.565f, 0.656f, 0.123f, 0.665f, 0.343f};
        System.out.println("Original array:");
        printArray(arr);

        bucketSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}


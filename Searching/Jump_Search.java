// Time Complexity:-  Best Case:O(1) 
//                    Average case:O(⟌N) 
//                    Worst case:O(⟌N) 
// Space Complexity:- O(1)

public class Jump_Search {

    public static int jumpSearch(int[] arr, int key) {
        int n = arr.length;

        int step = (int) Math.sqrt(n);
        int prev = 0;

        while (arr[Math.min(step, n) - 1] < key) {
            prev = step;
            step += (int) Math.sqrt(n);
            if (prev >= n) {
                return -1;
            }
        }

        while (arr[prev] < key) {
            prev++;
            if (prev == Math.min(step, n)) {
                return -1;
            }
        }

        if (arr[prev] == key) {
            return prev;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 23, 45, 56, 67, 89, 90, 100, 103 };
        int key = 100;
        int result = jumpSearch(arr, key);

        if (result == -1) {
            System.out.println("Element is not in the array :-(");
        } else {
            System.out.println("Element found at position : " + result);
        }
    }
}
 {
    
}

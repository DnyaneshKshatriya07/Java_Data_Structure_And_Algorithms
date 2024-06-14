// Time Complexity:-  Best Case:O(1) 
//                    Average case:O(Log N) 
//                    Worst case:O(Log N) 
// Space Complexity:- O(1)

public class Exponential_Search {

    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public static int binarySearch(int[] arr, int l, int r, int x) {
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] < x)
                l = mid + 1;
            else
                r = mid - 1;
        }

        return -1;
    }

    public static int exponentialSearch(int[] arr, int n, int x) {
        if (arr[0] == x)
            return 0;

        int i = 1;
        while (i < n && arr[i] <= x)
            i = i * 2;

        return binarySearch(arr, i / 2, min(i, n - 1), x);
    }

    public static void main(String[] args) {
        int[] arr = { 21, 27, 32, 41, 49, 55, 67, 78, 99 };
        int n = arr.length;
        int x = 78;

        int result = exponentialSearch(arr, n, x);

        if (result == -1) {
            System.out.println("Search key is not present in array");
        } else {
            System.out.println("Search key is present at index " + result);
        }
    }
}


// Time Complexity:-  Best Case:O(1) 
//                    Average case:O(log2(log2(N)) 
//                    Worst case:O(N) 
//              where N is the total number of elements in the array.
// Space Complexity:- O(1)

public class interpolation_Search {
    public static void main(String[] args) {
        int[] array = new int[] { 2, 3, 6, 8, 10, 13, 16, 18 };
        int K = 13;

        int res = interpolationSearch(array, K);

        if (res >= 0) {
            System.out.println(K + " found at index: " + res);
        } else {
            System.out.println(K + " not found");
        }
    }

    private static int interpolationSearch(int[] array, int K) {
        int n = array.length;
        int low = 0;
        int high = n - 1;

        while (low <= high && K >= array[low] && K <= array[high]) {

            int index = low + ((K - array[low]) * (high - low)) / (array[high] - array[low]);

            if (array[index] < K) {
                low = index + 1;
            } else if (array[index] > K) {
                high = index - 1;
            } else {
                // found K
                return index;
            }
        }

        return -1;
    }

}

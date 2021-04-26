import java.util.*;

public class SubMax {
    // Find the maximum length subarray with sum `S` present in a given array
    public static void findMaxLenSubarray(int[] A, int S)
    {
        // create an empty HashMap to store the ending index of the first
        // subarray having some sum
        Map<Integer, Integer> map = new HashMap<>();

        // insert `(0, -1)` pair into the set to handle the case when a
        // subarray with sum `S` starts from index 0
        map.put(0, -1);

        int sum = 0;

        // `len` stores the maximum length of subarray with sum `S`
        int len = 0;

        // stores ending index of the maximum length subarray having sum `S`
        int ending_index = -1;

        // traverse the given array
        for (int i = 0; i < A.length; i++)
        {
            // sum of elements so far
            sum += A[i];

            // if the sum is seen for the first time, insert the sum with its
            // into the map
            map.putIfAbsent(sum, i);

            // update length and ending index of the maximum length subarray
            // having sum `S`
            if (map.containsKey(sum - S) && len < i - map.get(sum - S))
            {
                len = i - map.get(sum - S);
                ending_index = i;
            }
        }

        // print the subarray
        System.out.println("[" + (ending_index - len + 1) + ", " + ending_index + "]");
    }

    public static void main (String[] args)
    {
        int[] A = { 5, 6, -5, 5, 3, 5, 3, -2, 0 };
        int sum = 8;

        findMaxLenSubarray(A, sum);
    }
}

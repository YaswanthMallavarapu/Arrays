import java.util.HashMap;

class Solution {
    int maxLen(int arr[]) {
        int len = 0;
        int n = arr.length;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            // If the sum is 0, the subarray from the start to the current index has sum 0
            if (sum == 0) {
                len = i + 1;
            }

            // If the sum is already present in the map, calculate the length
            if (map.containsKey(sum)) {
                int subLen = i - map.get(sum);
                len = Math.max(len, subLen);
            } else {
                // Otherwise, store this sum with its index
                map.put(sum, i);
            }
        }
        return len;
    }
}
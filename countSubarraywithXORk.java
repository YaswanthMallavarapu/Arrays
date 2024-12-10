public class Solution {
    public int solve(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int xor = 0;
        map.put(0, 1);
        for (int i = 0; i < n; i++) {
            xor ^= nums[i];
            int x = xor ^ k;
            if (map.containsKey(x)) {
                count += map.get(x);
            }
            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }
        return count;
    }
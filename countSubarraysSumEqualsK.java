public class countSubarraysSumEqualsK {
    class Solution {
        public int subarraySum(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(0, 1);
            int sum = 0, count = 0;
            int n = nums.length;
            for (int i = 0; i < n; i++) {
                sum += nums[i];

                int occurance = map.getOrDefault(sum - k, 0);
                count += occurance;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
            return count;
        }
    }
}

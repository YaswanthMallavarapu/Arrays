import java.util.Arrays;

public class longestCommanSequence {

    public static int longest(int nums[]) {
        Arrays.sort(nums);
        int longest = 1;
        int count = 0;
        int neighbour = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] - 1 == neighbour) {
                count++;
                neighbour = nums[i];
            } else if (nums[i] != neighbour) {

                count = 1;
                neighbour = nums[i];
            }
            longest = Integer.max(longest, count);

        }
        return longest;
    }

    public static void main(String[] args) {
        int arr[] = { 100, 200, 1, 2, 3, 4 };
        int ans = longest(arr);
        System.out.println(ans);
    }
}

// import java.util.*;

// public class tUf {
// public static int longestSuccessiveElements(int[] a) {
// int n = a.length;
// if (n == 0)
// return 0;

// // sort the array:
// Arrays.sort(a);
// int lastSmaller = Integer.MIN_VALUE;
// int cnt = 0;
// int longest = 1;

// // find longest sequence:
// for (int i = 0; i < n; i++) {
// if (a[i] - 1 == lastSmaller) {
// // a[i] is the next element of the
// // current sequence.
// cnt += 1;
// lastSmaller = a[i];
// } else if (a[i] != lastSmaller) {
// cnt = 1;
// lastSmaller = a[i];
// }
// longest = Math.max(longest, cnt);
// }
// return longest;
// }

// public static void main(String[] args) {
// int[] a = { 100, 200, 1, 2, 3, 4 };
// int ans = longestSuccessiveElements(a);
// System.out.println("The longest consecutive sequence is " + ans);
// }
// }

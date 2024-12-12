import java.util.Arrays;

public class mergeTwoSortedArrays {
    public static void swap(int[] nums1, int nums2[], int i, int j) {
        int temp = nums1[i];
        nums1[i] = nums2[j];
        nums2[j] = temp;
    }

    public static void mergeArrays(int[] nums1, int nums2[]) {
        int n = nums1.length;
        int m = nums2.length;
        int left = n - 1;
        int right = 0;
        while (left >= 0 && right < m) {
            if (nums1[left] > nums2[right]) {
                swap(nums1, nums2, left, right);
                left--;
                right++;
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int nums1[] = { 1, 3, 5, 9 };
        int nums2[] = { 0, 1, 2, 7 };
        mergeArrays(nums1, nums2);
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for (int i : nums1) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : nums2) {
            System.out.print(i + " ");
        }

    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class threeSum {

    public static List<List<Integer>> findThreeSums(int arr[]) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i - 1])
                continue;
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(arr[k]);
                    Arrays.sort(temp);
                    ans.add(temp);
                    j++;
                    k--;
                    while (j < k && arr[j] == arr[j - 1])
                        j++;
                    while (j < k && arr[k] == arr[k + 1])
                        k++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { -1, 0, 1, 2, -4 };
        List<List<Integer>> ans = findThreeSums(arr);
        for (List a : ans) {
            System.out.println(a);
        }
    }
}

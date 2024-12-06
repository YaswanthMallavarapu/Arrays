import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {

    public static List<Integer> pascalRow(int n) {
        int ans = 1;

        List<Integer> row = new ArrayList<>();
        row.add(1);
        for (int i = 1; i < n; i++) {
            ans *= (n - i);
            ans /= i;
            row.add(ans);
        }
        return row;
    }

    public static List<List<Integer>> pascalTriangle(int n) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            ans.add(pascalRow(i));
        }
        return ans;
    }

    public static void main(String[] args) {
        List<List<Integer>> ans = pascalTriangle(6);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}

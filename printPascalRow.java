import java.util.ArrayList;
import java.util.List;

public class printPascalRow {
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

    public static void main(String[] args) {
        List<Integer> row = pascalRow(5);
        for (int i = 0; i < row.size(); i++) {
            System.out.println(row.get(i));
        }
    }
}

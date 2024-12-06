public class NCR {
    // method 1
    // public static int factorial(int n) {
    // int ans = 1;
    // for (int i = 1; i <= n; i++) {
    // ans *= i;
    // }
    // return ans;
    // }

    // public static int nCr(int n, int r) {
    // return (factorial(n) / (factorial(r) * factorial(n - r)));
    // }

    // public static int pascalElement(int n, int r) {
    // return nCr(n - 1, r - 1);
    // }

    public static int nCr(int n, int r) {
        int ans = n;
        for (int i = 1; i <= r; i++) {
            ans *= (n - i);
            ans /= i;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(nCr(6, 5));
    }
}

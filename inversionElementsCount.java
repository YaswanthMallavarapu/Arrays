public class inversionElementsCount {

    public static int countInversions(int arr[]) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 2, 3, 7, 5, 6 };

        System.out.println(countInversions(arr));

    }
}

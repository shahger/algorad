public class task2 {

    public static int sum(int[] arr, int n) {
        if (n == 0) return 0;
        return arr[n - 1] + sum(arr, n - 1);
    }

    public static void inputArray(int[] arr, int i, java.util.Scanner sc) {
        if (i == arr.length) return;
        arr[i] = sc.nextInt();
        inputArray(arr, i + 1, sc);
    }
}
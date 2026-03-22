public class task1 {
    public static void printDigits(int n) {
        if (n == 0) return;
        printDigits(n / 10);
        System.out.println(n % 10);
    }
}

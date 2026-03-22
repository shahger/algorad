import java.util.Scanner;

public class task7 {
    public static void reversePrint(int n, Scanner sc) {
        if (n == 0) return;
        int x = sc.nextInt();
        reversePrint(n - 1, sc);
        System.out.print(x + " ");
    }
}
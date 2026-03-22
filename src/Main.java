import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Task 1
        System.out.println("Task 1:");
        task1.printDigits(5481);

        // Task 2
        System.out.println("\nTask 2:");
        int[] arr = {3, 2, 4, 1};
        double avg = (double) task2.sum(arr, arr.length) / arr.length;
        System.out.println(avg);

        // Task 3
        System.out.println("\nTask 3:");
        System.out.println(task3.isPrime(7, 2) ? "Prime" : "Composite");

        // Task 4
        System.out.println("\nTask 4:");
        System.out.println(task4.factorial(5));

        // Task 5
        System.out.println("\nTask 5:");
        System.out.println(task5.fibonacci(5));

        // Task 6
        System.out.println("\nTask 6:");
        System.out.println(task6.power(2, 10));
     // Task 7
        System.out.println("\nTask 7:");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // вводим количество
        task7.reversePrint(n, sc);

        // Task 8
        System.out.println("\nTask 8:");
        System.out.println(task8.onlyDigits("123456", 0) ? "Yes" : "No");

        // Task 9
        System.out.println("\nTask 9:");
        System.out.println(task9.length("hello"));

        // Task 10
        System.out.println("\nTask 10:");
        System.out.println(task10.gcd(32, 48));
    }
}
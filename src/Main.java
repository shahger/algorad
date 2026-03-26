import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Task 1
        System.out.println("Task 1: Enter a number");
        int num = sc.nextInt();
        task1.printDigits(num);

        //Task 2
        System.out.println("\nTask 2: Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        task2.inputArray(arr, 0, sc);

        double avg = (double) task2.sum(arr, n) / n;
        System.out.println("Average: " + avg);

        //Task 3
        System.out.println("\nTask 3: Enter number");
        int primeNum = sc.nextInt();
        System.out.println(task3.isPrime(primeNum, 2) ? "Prime" : "Composite");

        //Task 4
        System.out.println("\nTask 4: Enter n");
        int fact = sc.nextInt();
        System.out.println("Factorial: " + task4.factorial(fact));

        //Task 5
        System.out.println("\nTask 5: Enter n");
        int fib = sc.nextInt();
        System.out.println("Fibonacci: " + task5.fibonacci(fib));

        //Task 6
        System.out.println("\nTask 6: Enter a and n");
        int a = sc.nextInt();
        int pow = sc.nextInt();
        System.out.println("Result: " + task6.power(a, pow));

        //Task 7
        System.out.println("\nTask 7: Enter n and then numbers");
        int count = sc.nextInt();
        task7.reversePrint(count, sc);

        //Task 8
        System.out.println("\n\nTask 8: Enter string");
        String s = sc.next();
        System.out.println(task8.onlyDigits(s, 0) ? "Yes" : "No");

        //Task 9
        System.out.println("\nTask 9: Enter string");
        String str = sc.next();
        System.out.println("Length: " + task9.length(str));

        //Task 10
        System.out.println("\nTask 10: Enter two numbers");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("GCD: " + task10.gcd(x, y));

        sc.close();
    }
}
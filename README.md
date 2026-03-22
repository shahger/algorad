Assignment 1 – Algorithms and Data Structures
Recursion and OOP Implementation

Student: Shakhriyar Yerzhanov
Group: IT-2504

Introduction

This assignment focuses on implementing recursive algorithms using Object-Oriented Programming principles in Java. Each task is implemented as a separate class containing a recursive method. The purpose is to demonstrate understanding of recursion, including base cases and recursive calls, without using loops.

Technologies Used

Java
IntelliJ IDEA
GitHub

Task 1 – Print Digits

Description
Print the digits of a number in order using recursion.

Approach
The function recursively divides the number by 10 until it reaches zero and prints each digit during the return phase.

<img width="68" height="131" alt="image" src="https://github.com/user-attachments/assets/5af20280-674a-4def-bf60-274dc09bd5f4" />


Task 2 – Average of Array

Description
Calculate the average of array elements using recursion.

Approach
A recursive function computes the sum of elements, which is then divided by the number of elements.

<img width="141" height="49" alt="image" src="https://github.com/user-attachments/assets/15831045-b961-495f-8b50-8ce49b4494fc" />


Task 3 – Prime Number Check

Description
Determine whether a number is prime.

Approach
The function recursively checks divisibility starting from 2 up to the square root of the number.

<img width="110" height="45" alt="image" src="https://github.com/user-attachments/assets/32cd1887-4609-4d15-b378-1873ce0a3702" />


Task 4 – Factorial

Description
Compute the factorial of a number.

Approach
Each recursive call multiplies the current number by the result of the previous call.

<img width="97" height="54" alt="image" src="https://github.com/user-attachments/assets/8c3d77f0-583a-433b-83bd-251e36c5bab3" />


Task 5 – Fibonacci

Description
Find the n-th Fibonacci number.

Approach
Each value is calculated as the sum of the two previous values using recursion.

<img width="108" height="45" alt="image" src="https://github.com/user-attachments/assets/8b2574a5-d075-474c-99c7-b37fb6b81aeb" />


Task 6 – Power Function

Description
Compute a number raised to a power.

Approach
The base value is multiplied recursively until the exponent reaches zero.

<img width="91" height="64" alt="image" src="https://github.com/user-attachments/assets/d56f13e0-b0cd-4eac-af39-6681e4e122aa" />


Task 7 – Reverse Sequence

Description
Read a sequence of numbers and print them in reverse order.

Approach
Each element is read before the recursive call and printed after it, which produces reversed output.

<img width="120" height="185" alt="image" src="https://github.com/user-attachments/assets/3d38c40c-9208-4ad7-9387-2f1d3dceb601" />


Task 8 – Check Digits Only

Description
Check whether a string contains only digits.

Approach
Each character is checked recursively to determine whether it is a digit.

<img width="134" height="48" alt="image" src="https://github.com/user-attachments/assets/a60895a3-a7c3-4dc7-84a1-c062e109cf4f" />


Task 9 – String Length

Description
Find the length of a string using recursion.

Approach
The function reduces the string by one character at each step until it becomes empty.

<img width="134" height="44" alt="image" src="https://github.com/user-attachments/assets/2743f341-f9bb-4060-8208-d06dd66e9aef" />


Task 10 – GCD

Description
Compute the greatest common divisor of two numbers.

Approach
The Euclidean algorithm is applied recursively.

<img width="98" height="79" alt="image" src="https://github.com/user-attachments/assets/e977c86a-5722-41ad-aa17-852a13ff0aa1" />

Conclusion

This assignment demonstrates how recursion can be used to solve different problems. Each task is implemented as a separate class, following object-oriented design principles, which improves code organization and readability. Proper use of base cases ensures correct termination of recursive calls.

Notes

No loops were used
Each method includes a base case
Tasks are separated into individual classes

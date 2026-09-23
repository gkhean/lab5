/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mathapp.java;
import java.util.Scanner;
/**
 *
 * @author dell
 */
public class MathAppJava {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\n=== Math App Menu ===");
            System.out.println("1. Addition of two numbers");
            System.out.println("2. Subtraction of two numbers");
            System.out.println("3. Multiplication of two numbers");
            System.out.println("4. Division of two numbers");
            System.out.println("5. Factorial of a number");
            System.out.println("6. Power (x^y)");
            System.out.println("7. Sum of numbers 1 to N");
            System.out.println("8. Check if a number is prime");
            System.out.println("9. Greatest Common Divisor (GCD)");
            System.out.println("10. Absolute value of a number");
            System.out.println("11. Average of N numbers (stored in an array)");
            System.out.println("12. Maximum of N numbers (stored in an array)");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                
            
                 // 1. Addition
                 
                case 1:
                    System.out.print("Enter first number: ");
                    double add1 = input.nextDouble();

                    System.out.print("Enter second number: ");
                    double add2 = input.nextDouble();

                    System.out.println("Result: " + (add1 + add2));
                    break;
                    
                     // 2. Subtraction
                case 2:
                    System.out.print("Enter first number: ");
                    double sub1 = input.nextDouble();

                    System.out.print("Enter second number: ");
                    double sub2 = input.nextDouble();

                    System.out.println("Result: " + (sub1 - sub2));
                    break;
                    
                    // 3. Multiplication
                case 3:
                    System.out.print("Enter first number: ");
                    double mul1 = input.nextDouble();

                    System.out.print("Enter second number: ");
                    double mul2 = input.nextDouble();

                    System.out.println("Result: " + (mul1 * mul2));
                    break;
                    
                     // 4. Division
                case 4:
                    System.out.print("Enter first number: ");
                    double div1 = input.nextDouble();

                    System.out.print("Enter second number: ");
                    double div2 = input.nextDouble();

                    if (div2 == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                    } else {
                        System.out.println("Result: " + (div1 / div2));
                    }
                    break;
                    
                     // 5. Factorial
                case 5:
                    System.out.print("Enter a non-negative integer: ");
                    int n = input.nextInt();

                    if (n < 0) {
                        System.out.println("Error: Factorial is not defined for negative numbers.");
                    } else {
                        long factorial = 1;

                        for (int i = 1; i <= n; i++) {
                            factorial *= i;
                        }

                        System.out.println("Factorial: " + factorial);
                    }
                    break;
                    
                     // 6. Power
                case 6:
                    System.out.print("Enter the base (x): ");
                    double x = input.nextDouble();

                    System.out.print("Enter the exponent (y): ");
                    double y = input.nextDouble();

                    double power = Math.pow(x, y);

                    System.out.println("Result: " + power);
                    break;
                    
                     // 7. Sum from 1 to N
                case 7:
                    System.out.print("Enter N: ");
                    int sumN = input.nextInt();

                    if (sumN < 1) {
                        System.out.println("Error: N must be at least 1.");
                    } else {
                        long sum = 0;

                        for (int i = 1; i <= sumN; i++) {
                            sum += i;
                        }

                        System.out.println("Sum of numbers 1 to " + sumN + ": " + sum);
                    }
                    break;
                    
                     // 8. Prime number
                case 8:
                    System.out.print("Enter a number: ");
                    int primeNum = input.nextInt();

                    boolean isPrime = true;

                    if (primeNum < 2) {
                        isPrime = false;
                    } else {
                        for (int i = 2; i <= primeNum / i; i++) {
                            if (primeNum % i == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                    }

                    if (isPrime) {
                        System.out.println(primeNum + " is a prime number.");
                    } else {
                        System.out.println(primeNum + " is not a prime number.");
                         }
                    break;
                    
                    
                    // 9. GCD
                case 9:
                    System.out.print("Enter first number: ");
                    int gcdA = input.nextInt();

                    System.out.print("Enter second number: ");
                    int gcdB = input.nextInt();

                    gcdA = Math.abs(gcdA);
                    gcdB = Math.abs(gcdB);

                    if (gcdA == 0 && gcdB == 0) {
                        System.out.println("Error: GCD of 0 and 0 is undefined.");
                    } else {
                        while (gcdB != 0) {
                            int remainder = gcdA % gcdB;
                            gcdA = gcdB;
                            gcdB = remainder;
                        }

                        System.out.println("GCD: " + gcdA);
                    }
                     break;
                     
                      // 10. Absolute value
                case 10:
                    System.out.print("Enter a number: ");
                    double absNum = input.nextDouble();

                    System.out.println("Absolute value: " + Math.abs(absNum));
                    break;

                // 11. Average of N numbers
                case 11:
                    System.out.print("Enter N (number of values): ");
                    int avgN = input.nextInt();

                    if (avgN <= 0) {
                        System.out.println("Error: N must be greater than 0.");
                    } else {
                        double[] numbers = new double[avgN];
                        double total = 0;
                        
                         for (int i = 0; i < avgN; i++) {
                            System.out.print("Enter number " + (i + 1) + ": ");
                            numbers[i] = input.nextDouble();
                            total += numbers[i];
                        }

                        double average = total / avgN;

                        System.out.println("Average: " + average);
                    }
                    break;
                    
                     // 12. Maximum of N numbers
                case 12:
                    System.out.print("Enter N (number of values): ");
                    int maxN = input.nextInt();

                    if (maxN <= 0) {
                        System.out.println("Error: N must be greater than 0.");
                    } else {
                        double[] numbers = new double[maxN];

                        for (int i = 0; i < maxN; i++) {
                            System.out.print("Enter number " + (i + 1) + ": ");
                            numbers[i] = input.nextDouble();
                        }

                        double maximum = numbers[0];
                                                for (int i = 1; i < maxN; i++) {
                            if (numbers[i] > maximum) {
                                maximum = numbers[i];
                            }
                        }

                        System.out.println("Maximum: " + maximum);
                    }
                    break;

                // Exit
                case 0:
                    System.out.println("Thank you!");
                    break;
                    
                    // Invalid choice
                default:
                    System.out.println("Invalid choice. Please select 0 to 12.");
            }

        
    }  while (choice != 0);
 }
}

 

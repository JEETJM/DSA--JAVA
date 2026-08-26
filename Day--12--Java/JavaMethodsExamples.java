import java.util.Scanner;

public class JavaMethodsExamples {

    // 1. Method without parameter and without return
    static void greet() {
        System.out.println("Hello! Welcome to Java Methods.");
    }

    // 2. Method with parameters and without return
    static void printName(String name) {
        System.out.println("Name: " + name);
    }

    // 3. Method with parameters and with return
    static int add(int a, int b) {
        return a + b;
    }

    // 4. Method without parameter but with return
    static int getNumber() {
        return 100;
    }

    // 5. Method for subtraction
    static int subtract(int a, int b) {
        return a - b;
    }

    // 6. Method for multiplication
    static int multiply(int a, int b) {
        return a * b;
    }

    // 7. Method for division
    static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
        return a / b;
    }

    // 8. Method to find square
    static int square(int n) {
        return n * n;
    }

    // 9. Method to find cube
    static int cube(int n) {
        return n * n * n;
    }

    // 10. Method to check even or odd
    static void checkEvenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is Even.");
        } else {
            System.out.println(n + " is Odd.");
        }
    }

    // 11. Method to find maximum of two numbers
    static int maxOfTwo(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // 12. Method to find maximum of three numbers
    static int maxOfThree(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;
    }

    // 13. Method to calculate factorial
    static int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    // 14. Recursive method for factorial
    static int factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorialRecursive(n - 1);
    }

    // 15. Method to check prime number
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // 16. Method to print array
    static void printArray(int[] arr) {
        System.out.print("Array elements: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    // 17. Method to find sum of array
    static int arraySum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }

    // 18. Method to find maximum element in array
    static int arrayMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    // 19. Method to print 2D array
    static void printMatrix(int[][] matrix) {
        System.out.println("Matrix:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // 20. Method to find diagonal sum of square matrix
    static int diagonalSum(int[][] matrix) {
        int n = matrix.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + matrix[i][i];

            if (i != n - 1 - i) {
                sum = sum + matrix[i][n - 1 - i];
            }
        }

        return sum;
    }

    // 21. Method overloading: same method name, different parameters
    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static double sum(double a, double b) {
        return a + b;
    }

    // 22. Method using String
    static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    // 23. Method to reverse string
    static String reverseString(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        return reversed;
    }

    // 24. Method to check palindrome string
    static boolean isPalindrome(String str) {
        String reversed = reverseString(str);

        return str.equalsIgnoreCase(reversed);
    }

    // 25. Method with variable arguments
    static int sumVarArgs(int... numbers) {
        int sum = 0;

        for (int num : numbers) {
            sum = sum + num;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1
        greet();

        // 2
        System.out.print("\nEnter your name: ");
        String name = sc.nextLine();
        printName(name);

        // 3
        System.out.print("\nEnter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Addition = " + add(a, b));
        System.out.println("Subtraction = " + subtract(a, b));
        System.out.println("Multiplication = " + multiply(a, b));
        System.out.println("Division = " + divide(a, b));

        // 4
        System.out.println("\nNumber returned by getNumber() = " + getNumber());

        // 5
        System.out.print("\nEnter a number for square and cube: ");
        int num = sc.nextInt();

        System.out.println("Square = " + square(num));
        System.out.println("Cube = " + cube(num));

        // 6
        checkEvenOdd(num);

        // 7
        System.out.print("\nEnter third number: ");
        int c = sc.nextInt();

        System.out.println("Maximum of two numbers = " + maxOfTwo(a, b));
        System.out.println("Maximum of three numbers = " + maxOfThree(a, b, c));

        // 8
        System.out.print("\nEnter number for factorial: ");
        int factNum = sc.nextInt();

        System.out.println("Factorial using loop = " + factorial(factNum));
        System.out.println("Factorial using recursion = " + factorialRecursive(factNum));

        // 9
        System.out.print("\nEnter number to check prime: ");
        int primeNum = sc.nextInt();

        if (isPrime(primeNum)) {
            System.out.println(primeNum + " is Prime.");
        } else {
            System.out.println(primeNum + " is Not Prime.");
        }

        // 10
        System.out.print("\nEnter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements:");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        printArray(arr);
        System.out.println("Array Sum = " + arraySum(arr));
        System.out.println("Array Maximum = " + arrayMax(arr));

        // 11
        System.out.print("\nEnter size of square matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        printMatrix(matrix);
        System.out.println("Diagonal Sum = " + diagonalSum(matrix));

        // 12 Method overloading
        System.out.println("\nMethod Overloading Examples:");
        System.out.println("sum(10, 20) = " + sum(10, 20));
        System.out.println("sum(10, 20, 30) = " + sum(10, 20, 30));
        System.out.println("sum(5.5, 4.5) = " + sum(5.5, 4.5));

        // consume leftover newline
        sc.nextLine();

        // 13 String methods
        System.out.print("\nEnter first name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter last name: ");
        String lastName = sc.nextLine();

        String completeName = fullName(firstName, lastName);
        System.out.println("Full Name = " + completeName);

        System.out.print("\nEnter a string to reverse: ");
        String text = sc.nextLine();

        System.out.println("Reversed String = " + reverseString(text));

        if (isPalindrome(text)) {
            System.out.println(text + " is Palindrome.");
        } else {
            System.out.println(text + " is Not Palindrome.");
        }

        // 14 Varargs
        System.out.println("\nVarargs Sum = " + sumVarArgs(10, 20, 30, 40, 50));

        sc.close();
    }
}
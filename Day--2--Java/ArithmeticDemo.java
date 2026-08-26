

public class ArithmeticDemo {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // 🔹 Binary Operators
        System.out.println("Addition (+): " + (a + b));
        System.out.println("Subtraction (-): " + (a - b));
        System.out.println("Multiplication (*): " + (a * b));
        System.out.println("Division (/): " + (a / b));
        System.out.println("Modulus (%): " + (a % b));

        // 🔹 Unary Operators
        int x = 5;

        System.out.println("\nUnary Operations:");

        // Pre Increment
        System.out.println("Pre Increment (++x): " + (++x));

        // Post Increment
        System.out.println("Post Increment (x++): " + (x++));

        // After post increment
        System.out.println("Value after x++: " + x);

        // Pre Decrement
        System.out.println("Pre Decrement (--x): " + (--x));

        // Post Decrement
        System.out.println("Post Decrement (x--): " + (x--));

        // Final value
        System.out.println("Final value of x: " + x);

        // Unary + and -
        int y = 7;
        System.out.println("\nUnary + and -:");
        System.out.println("+y: " + (+y));
        System.out.println("-y: " + (-y));
    }
}
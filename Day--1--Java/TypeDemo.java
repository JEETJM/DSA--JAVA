// import java.util.*;

public class TypeDemo {
    public static void main(String[] args) {

        // 🔹 Type Conversion (Implicit)
        int a = 10;
        double b = a;  // int → double

        System.out.println("Type Conversion:");
        System.out.println("int a = " + a);
        System.out.println("double b = " + b);

        // 🔹 Type Casting (Explicit)
        double x = 9.75;
        int y = (int) x;  // double → int

        System.out.println("\nType Casting:");
        System.out.println("double x = " + x);
        System.out.println("int y = " + y);

        // 🔹 Division Example (Important)
        int p = 5;
        int q = 2;

        double result1 = p / q; // wrong
        double result2 = (double) p / q; // correct

        System.out.println("\nDivision:");
        System.out.println("Without casting: " + result1);
        System.out.println("With casting: " + result2);

        // 🔹 Char to int (ASCII)
        char ch = 'A';
        int num = ch;

        System.out.println("\nChar Conversion:");
        System.out.println("char ch = " + ch);
        System.out.println("int num = " + num);

        // 🔹 Float Example
        float f = 3.14f;
        double d = f;

        System.out.println("\nFloat Conversion:");
        System.out.println("float f = " + f);
        System.out.println("double d = " + d);
    }
}
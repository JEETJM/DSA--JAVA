public class BitsAndBitwiseOperators {
    public static void main(String[] args) {

        int a = 5;   // Binary: 0101
        int b = 3;   // Binary: 0011

        System.out.println("===== BITS AND BITWISE OPERATORS =====");

        System.out.println("\na = " + a);
        System.out.println("b = " + b);

        System.out.println("Binary of a = " + Integer.toBinaryString(a));
        System.out.println("Binary of b = " + Integer.toBinaryString(b));

        System.out.println("\n8-bit form of a = " + String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0'));
        System.out.println("8-bit form of b = " + String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0'));

        // LSB
        int lsb = a & 1;
        System.out.println("\nLSB of a = " + lsb);

        if (lsb == 0) {
            System.out.println("a is Even");
        } else {
            System.out.println("a is Odd");
        }

        // MSB in 32-bit int
        int msb = (a >> 31) & 1;
        System.out.println("\nMSB of a in 32-bit = " + msb);

        if (msb == 0) {
            System.out.println("a is Positive");
        } else {
            System.out.println("a is Negative");
        }

        System.out.println("\n----------------------------------");

        // Bitwise AND
        System.out.println("1. Bitwise AND (&)");
        System.out.println("a & b = " + (a & b));
        System.out.println("Binary = " + Integer.toBinaryString(a & b));

        System.out.println("\nExplanation:");
        System.out.println("0101");
        System.out.println("0011");
        System.out.println("----");
        System.out.println("0001");

        System.out.println("\n----------------------------------");

        // Bitwise OR
        System.out.println("2. Bitwise OR (|)");
        System.out.println("a | b = " + (a | b));
        System.out.println("Binary = " + Integer.toBinaryString(a | b));

        System.out.println("\nExplanation:");
        System.out.println("0101");
        System.out.println("0011");
        System.out.println("----");
        System.out.println("0111");

        System.out.println("\n----------------------------------");

        // Bitwise XOR
        System.out.println("3. Bitwise XOR (^)");
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("Binary = " + Integer.toBinaryString(a ^ b));

        System.out.println("\nExplanation:");
        System.out.println("0101");
        System.out.println("0011");
        System.out.println("----");
        System.out.println("0110");

        System.out.println("\n----------------------------------");

        // Bitwise NOT
        System.out.println("4. Bitwise NOT (~)");
        System.out.println("~a = " + (~a));
        System.out.println("Binary = " + Integer.toBinaryString(~a));

        System.out.println("\nFormula:");
        System.out.println("~n = -(n + 1)");
        System.out.println("~5 = -(5 + 1) = -6");

        System.out.println("\n----------------------------------");

        // Left Shift
        System.out.println("5. Left Shift (<<)");
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("a << 2 = " + (a << 2));

        System.out.println("\nFormula:");
        System.out.println("n << k = n * 2^k");
        System.out.println("5 << 1 = 5 * 2 = 10");
        System.out.println("5 << 2 = 5 * 4 = 20");

        System.out.println("\n----------------------------------");

        // Signed Right Shift
        System.out.println("6. Signed Right Shift (>>)");
        System.out.println("a >> 1 = " + (a >> 1));
        System.out.println("a >> 2 = " + (a >> 2));

        System.out.println("\nFormula:");
        System.out.println("n >> k = n / 2^k");
        System.out.println("5 >> 1 = 5 / 2 = 2");
        System.out.println("5 >> 2 = 5 / 4 = 1");

        System.out.println("\n----------------------------------");

        // Unsigned Right Shift
        System.out.println("7. Unsigned Right Shift (>>>)");
        System.out.println("a >>> 1 = " + (a >>> 1));

        int negative = -5;

        System.out.println("\nNegative number example:");
        System.out.println("negative = " + negative);
        System.out.println("Binary of negative = " + Integer.toBinaryString(negative));
        System.out.println("negative >> 1 = " + (negative >> 1));
        System.out.println("negative >>> 1 = " + (negative >>> 1));

        System.out.println("\n----------------------------------");

        // Logical AND example
        int age = 20;
        int marks = 70;

        System.out.println("8. Logical AND (&&)");
        System.out.println("age > 18 && marks > 50 = " + (age > 18 && marks > 50));

        System.out.println("\nRemember:");
        System.out.println("& works with bits.");
        System.out.println("&& works with conditions.");
    }
}
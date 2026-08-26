public class AllBitwiseOperators {
    public static void main(String[] args) {

        int a = 5;   // Binary: 0101
        int b = 3;   // Binary: 0011

        System.out.println("===== BITWISE OPERATORS IN JAVA =====");

        System.out.println("\na = " + a);
        System.out.println("b = " + b);

        System.out.println("Binary of a = " + Integer.toBinaryString(a));
        System.out.println("Binary of b = " + Integer.toBinaryString(b));

        System.out.println("\n------------------------------------");

        // 1. Bitwise AND
        int andResult = a & b;
        System.out.println("1. Bitwise AND (&)");
        System.out.println("a & b = " + andResult);
        System.out.println("Binary result = " + Integer.toBinaryString(andResult));

        System.out.println("\nExplanation:");
        System.out.println("5  = 0101");
        System.out.println("3  = 0011");
        System.out.println("&  = 0001");
        System.out.println("So, 5 & 3 = 1");

        System.out.println("\n------------------------------------");

        // 2. Bitwise OR
        int orResult = a | b;
        System.out.println("2. Bitwise OR (|)");
        System.out.println("a | b = " + orResult);
        System.out.println("Binary result = " + Integer.toBinaryString(orResult));

        System.out.println("\nExplanation:");
        System.out.println("5  = 0101");
        System.out.println("3  = 0011");
        System.out.println("|  = 0111");
        System.out.println("So, 5 | 3 = 7");

        System.out.println("\n------------------------------------");

        // 3. Bitwise XOR
        int xorResult = a ^ b;
        System.out.println("3. Bitwise XOR (^)");
        System.out.println("a ^ b = " + xorResult);
        System.out.println("Binary result = " + Integer.toBinaryString(xorResult));

        System.out.println("\nExplanation:");
        System.out.println("5  = 0101");
        System.out.println("3  = 0011");
        System.out.println("^  = 0110");
        System.out.println("So, 5 ^ 3 = 6");

        System.out.println("\n------------------------------------");

        // 4. Bitwise NOT
        int notResult = ~a;
        System.out.println("4. Bitwise NOT (~)");
        System.out.println("~a = " + notResult);
        System.out.println("Binary result = " + Integer.toBinaryString(notResult));

        System.out.println("\nExplanation:");
        System.out.println("Formula: ~n = -(n + 1)");
        System.out.println("~5 = -(5 + 1)");
        System.out.println("~5 = -6");

        System.out.println("\n------------------------------------");

        // 5. Left Shift
        int leftShiftResult = a << 1;
        System.out.println("5. Left Shift (<<)");
        System.out.println("a << 1 = " + leftShiftResult);
        System.out.println("Binary result = " + Integer.toBinaryString(leftShiftResult));

        System.out.println("\nExplanation:");
        System.out.println("5 = 0101");
        System.out.println("After left shift by 1: 1010");
        System.out.println("1010 = 10");
        System.out.println("Formula: a << n = a * 2^n");
        System.out.println("5 << 1 = 5 * 2^1 = 10");

        System.out.println("\n------------------------------------");

        // 6. Signed Right Shift
        int rightShiftResult = a >> 1;
        System.out.println("6. Signed Right Shift (>>)");
        System.out.println("a >> 1 = " + rightShiftResult);
        System.out.println("Binary result = " + Integer.toBinaryString(rightShiftResult));

        System.out.println("\nExplanation:");
        System.out.println("5 = 0101");
        System.out.println("After right shift by 1: 0010");
        System.out.println("0010 = 2");
        System.out.println("Formula: a >> n = a / 2^n");
        System.out.println("5 >> 1 = 5 / 2^1 = 2");

        System.out.println("\n------------------------------------");

        // 7. Unsigned Right Shift
        int unsignedRightShiftResult = a >>> 1;
        System.out.println("7. Unsigned Right Shift (>>>)");
        System.out.println("a >>> 1 = " + unsignedRightShiftResult);
        System.out.println("Binary result = " + Integer.toBinaryString(unsignedRightShiftResult));

        System.out.println("\nExplanation:");
        System.out.println("Unsigned right shift fills 0 from the left side.");
        System.out.println("For positive numbers, >> and >>> usually give the same result.");
        System.out.println("5 >>> 1 = 2");

        System.out.println("\n------------------------------------");

        // Extra: difference between >> and >>> for negative number
        int negative = -5;

        System.out.println("Extra Example: Difference between >> and >>>");
        System.out.println("negative = " + negative);
        System.out.println("Binary of negative = " + Integer.toBinaryString(negative));

        System.out.println("negative >> 1 = " + (negative >> 1));
        System.out.println("Binary = " + Integer.toBinaryString(negative >> 1));

        System.out.println("negative >>> 1 = " + (negative >>> 1));
        System.out.println("Binary = " + Integer.toBinaryString(negative >>> 1));
    }
}
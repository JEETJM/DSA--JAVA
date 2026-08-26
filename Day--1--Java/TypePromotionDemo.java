

public class TypePromotionDemo {
    public static void main(String[] args) {

        // 🔹 Rule 1: byte → int
        byte a = 10;
        byte b = 20;
        int result1 = a + b;
        System.out.println("byte + byte = " + result1);

        // 🔹 Rule 2: mixed types
        int x = 5;
        double y = 2.5;
        double result2 = x + y;
        System.out.println("int + double = " + result2);

        // 🔹 Rule 3: multiple types
        int p = 5;
        float q = 2.5f;
        double r = 3.5;
        double result3 = p + q + r;
        System.out.println("int + float + double = " + result3);

        // 🔹 Unary promotion
        byte m = 10;
        int result4 = -m;
        System.out.println("Unary promotion (-byte) = " + result4);

        // 🔹 Important trap
        byte u = 10;
        byte v = 20;
        byte w = (byte)(u + v); // casting required
        System.out.println("byte + byte with cast = " + w);
    }
}



    
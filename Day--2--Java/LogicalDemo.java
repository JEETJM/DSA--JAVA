public class LogicalDemo {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        // 🔹 Logical Operators

        // AND (&&)
        System.out.println("(a < b && b < c): " + (a < b && b < c));

        // OR (||)
        System.out.println("(a > b || b < c): " + (a > b || b < c));

        // NOT (!)
        System.out.println("!(a < b): " + !(a < b));

        // Combined Example
        System.out.println("(a < b && b > c) || (c > a): " + ((a < b && b > c) || (c > a)));
    }
}
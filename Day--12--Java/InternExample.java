public class InternExample {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = "Hello";

        System.out.println(str1 == str2);

        String str3 = str1.intern();

        System.out.println(str3 == str2);
    }
}
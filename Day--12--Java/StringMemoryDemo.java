public class StringMemoryDemo {
    public static void main(String[] args) {

        String s1 = "Mango";
        String s2 = "Mango";
        String s3 = new String("Mango");
        String s4 = s3.intern();

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);

        System.out.println("\nUsing == operator:");
        System.out.println("s1 == s2 : " + (s1 == s2));
        System.out.println("s1 == s3 : " + (s1 == s3));
        System.out.println("s1 == s4 : " + (s1 == s4));

        System.out.println("\nUsing equals() method:");
        System.out.println("s1.equals(s2) : " + s1.equals(s2));
        System.out.println("s1.equals(s3) : " + s1.equals(s3));
        System.out.println("s1.equals(s4) : " + s1.equals(s4));

        System.out.println("\nString immutability:");
        String fruit = "Apple";
        fruit.concat(" Juice");

        System.out.println("After concat without storing: " + fruit);

        fruit = fruit.concat(" Juice");

        System.out.println("After concat with storing: " + fruit);
    }
}
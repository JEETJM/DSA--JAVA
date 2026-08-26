public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");
        sb.insert(6, "Java ");
        sb.replace(6, 10, "Python");
        sb.delete(6, 13);
        sb.reverse();
        StringBuilder sb1 = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb1.append(ch +" ");

        }
        System.out.println(sb1);

        System.out.println(sb);
    }
}
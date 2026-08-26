public class StringLength {

    static int length(String str) {

        // Base Case
        if(str.equals("")) {
            return 0;
        }

        return 1 + length(str.substring(1));
    }

    public static void main(String[] args) {

        String str = "Hello";

        System.out.println(length(str));
    }
}
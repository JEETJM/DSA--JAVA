public class CountSubstring {

    static int countSub(String str, int i, int j, int n) {

        // Base Case
        if(n == 1) {
            return 1;
        }

        if(n <= 0) {
            return 0;
        }

        int result =
            countSub(str, i + 1, j, n - 1)
          + countSub(str, i, j - 1, n - 1)
          - countSub(str, i + 1, j - 1, n - 2);

        // Check first and last character
        if(str.charAt(i) == str.charAt(j)) {
            result++;
        }

        return result;
    }

    public static void main(String[] args) {

        String str = "abcab";

        int n = str.length();

        System.out.println(countSub(str, 0, n - 1, n));
    }
}
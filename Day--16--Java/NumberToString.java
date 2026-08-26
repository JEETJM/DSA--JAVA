public class NumberToString {

    static String digits[] = {
        "zero", "one", "two", "three", "four",
        "five", "six", "seven", "eight", "nine"
    };

    static void printDigits(int number) {

        // Base Case
        if(number == 0) {
            return;
        }

        int lastDigit = number % 10;

        printDigits(number / 10);

        System.out.print(digits[lastDigit] + " ");
    }

    public static void main(String[] args) {

        int number = 1947;

        printDigits(number);
    }
}
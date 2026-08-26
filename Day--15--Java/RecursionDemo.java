import java.util.Scanner;

class RecursionDemo {

    static void printNum(int n) {

        if (n == 1) {
            System.out.println(n);
            return;
        }

        System.out.println(n + " ");

        printNum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number  : ");
        int number = sc.nextInt();
        printNum(number);
        sc.close();
    }
}
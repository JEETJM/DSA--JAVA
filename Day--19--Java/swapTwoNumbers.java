import java.util.ArrayList;
import java.util.Scanner;

public class swapTwoNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter First Number: ");
        list.add(sc.nextInt());

        System.out.print("Enter Second Number: ");
        list.add(sc.nextInt());

        System.out.println("Before Swapping: " + list);

        // Swapping
        int temp = list.get(0);
        list.set(0, list.get(1));
        list.set(1, temp);

        System.out.println("After Swapping: " + list);

        sc.close();
    }
}
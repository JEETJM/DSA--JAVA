import java.util.ArrayList;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input size of the N : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter the element of " + i + " th position :");
            list.add(sc.nextInt());
        }

        System.out.println(list);
        System.out.println("---NOW THIS IS THE TIME OF REVERSING OF ALL ARRAYLIST  :");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        sc.close();

    }

}

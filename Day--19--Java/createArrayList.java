import java.util.ArrayList;
import java.util.Scanner;

public class createArrayList {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // ArrayList<Integer> list = new ArrayList<>();

        // // ArrayList<Integer> list = new ArrayList<>();

        // list.add(10);
        // list.add(20);
        // list.add(30);
        // System.out.println(list);
        // // System.out.println(list);
        // // get the element by using INDEX .
        // int element = list.get(0);
        // System.out.println(element);
        // // REMOVE element by using INDEX .
        // int removeElement = list.remove(1);
        // System.out.println(removeElement);
        // System.out.println("Print after removing element index is : 1 " + list);

        // ArrayList<Integer> list = new ArrayList<>();

        // list.add(5);
        // list.add(10);
        // list.add(15);

        // for (int i = 0; i < list.size(); i++) {

        // System.out.println(list.get(i));
        // }

        // Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter the input size of the N : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter the element of " + i + " th position :");
            list.add(sc.nextInt());
        }

        System.out.println(list);
        sc.close();

    }

}

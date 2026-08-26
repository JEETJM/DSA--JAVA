import java.util.ArrayList;

public class MaxMinElement {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(25);
        list.add(5);
        list.add(40);
        list.add(18);

        int max = list.get(0);
        int min = list.get(0);

        for (int i = 1; i < list.size(); i++) {

            if (list.get(i) > max) {
                max = list.get(i);
            }

            if (list.get(i) < min) {
                min = list.get(i); 
            }
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}
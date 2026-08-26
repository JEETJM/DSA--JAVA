
import java.util.ArrayList;

public class TwoDarray {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        matrix.add(new ArrayList<>());
        matrix.add(new ArrayList<>());
        matrix.add(new ArrayList<>());

        matrix.get(0).add(10);
        matrix.get(0).add(20);
        matrix.get(0).add(30);

        matrix.get(1).add(40);
        matrix.get(1).add(50);
        matrix.get(1).add(60);

        matrix.get(2).add(70);
        matrix.get(2).add(80);
        matrix.get(2).add(90);
         
        for (int i = 0; i < matrix.size(); i++) {

            for (int j = 0; j < matrix.get(i).size(); j++) {

                System.out.print(matrix.get(i).get(j) + " ");
            }

            System.out.println();
        }
        System.out.println();
        System.out.println(matrix);
    }

}

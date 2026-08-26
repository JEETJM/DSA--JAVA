
import java.util.LinkedList;

public class JCF_allegLL {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list.addFirst(5);
        list.addLast(40);

        System.out.println("List : " + list);

        System.out.println("First : " + list.getFirst());

        System.out.println("Last : " + list.getLast());

        list.removeFirst();

        list.removeLast();

        System.out.println("After Remove : " + list);

        list.set(1,100);

        System.out.println("Updated : " + list);

        System.out.println("Contains 30 : " + list.contains(30));

        System.out.println("Index of 30 : " + list.indexOf(30));

        System.out.println("Size : " + list.size());

        System.out.print("Traversal : ");

        for(Integer x : list)
        {
            System.out.print(x + " ");
        }
    }
}
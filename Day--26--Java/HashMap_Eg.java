import java.util.*;

public class HashMap_Eg {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        // Add data
        map.put(1, "Apple");
        map.put(2, "Mango");
        map.put(3, "Banana");

        // Get value
        System.out.println(map.get(1));

        // Check key
        System.out.println(map.containsKey(2));

        // Check another key
        System.out.println(map.containsKey(10));

        // Size
        System.out.println(map.size());

        // Remove
        map.remove(2);

        System.out.println(map.get(2));
    }

}

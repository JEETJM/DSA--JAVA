// public class inBuilt {

// }

// // 🔥 1. Arrays.sort() → Ascending (Primitive Array)

// import java.util.*;

// public class Main {
// public static void main(String[] args) {

// int arr[] = {5, 3, 2, 4};

// Arrays.sort(arr);

// System.out.println(Arrays.toString(arr));
// // Output: [2, 3, 4, 5]
// }
// }

// // 🔥 2. Arrays.sort() → Descending (Integer Array)

// import java.util.*;

// public class Main {
// public static void main(String[] args) {

// Integer arr[] = {5, 3, 2, 4};

// Arrays.sort(arr, Collections.reverseOrder());

// System.out.println(Arrays.toString(arr));
// // Output: [5, 4, 3, 2]
// }
// }

// // 🔥 3. Arrays.sort() → Partial Sorting

// import java.util.*;

// public class Main {
// public static void main(String[] args) {

// int arr[] = {5, 3, 2, 4, 1};

// Arrays.sort(arr, 1, 4);

// System.out.println(Arrays.toString(arr));
// // Output: [5, 2, 3, 4, 1]
// }
// }

// // 🔥 4. Arrays.sort() → String Sorting

// import java.util.*;

// public class Main {
// public static void main(String[] args) {

// String arr[] = {"banana", "apple", "mango"};

// Arrays.sort(arr);

// System.out.println(Arrays.toString(arr));
// // Output: [apple, banana, mango]
// }
// }

// // 🔥 5. Collections.sort() → ArrayList Ascending

// import java.util.*;

// public class Main {
// public static void main(String[] args) {

// ArrayList<Integer> list = new ArrayList<>();

// list.add(5);
// list.add(3);
// list.add(2);

// Collections.sort(list);

// System.out.println(list);
// // Output: [2, 3, 5]
// }
// }

// // 🔥 6. Collections.sort() → Descending

// import java.util.*;

// public class Main {
// public static void main(String[] args) {

// ArrayList<Integer> list = new ArrayList<>();

// list.add(5);
// list.add(3);
// list.add(2);

// Collections.sort(list, Collections.reverseOrder());

// System.out.println(list);
// // Output: [5, 3, 2]
// }
// }

// // 🔥 7. Comparator → Custom Sorting (Descending)

// import java.util.*;

// public class Main {
// public static void main(String[] args) {

// ArrayList<Integer> list = new ArrayList<>();

// list.add(5);
// list.add(3);
// list.add(2);

// Collections.sort(list, (a, b) -> b - a);

// System.out.println(list);
// // Output: [5, 3, 2]
// }
// }

// // 🔥 8. Comparator → Absolute Value Sorting

// import java.util.*;

// public class Main {
// public static void main(String[] args) {

// ArrayList<Integer> list = new ArrayList<>();

// list.add(-10);
// list.add(5);
// list.add(-3);

// Collections.sort(list, (a, b) -> Math.abs(a) - Math.abs(b));

// System.out.println(list);
// // Output: [-3, 5, -10]
// }
// }

// // 🔥 9. Comparator → Object Sorting (VERY IMPORTANT)

// import java.util.*;

// class Student {
// int marks;
// String name;

// Student(int m, String n) {
// marks = m;
// name = n;
// }
// }

// public class Main {
// public static void main(String[] args) {

// ArrayList<Student> list = new ArrayList<>();

// list.add(new Student(90, "Jeet"));
// list.add(new Student(70, "Rahul"));
// list.add(new Student(80, "Aman"));

// // Sort by marks
// Collections.sort(list, (a, b) -> a.marks - b.marks);

// for (Student s : list) {
// System.out.println(s.name + " " + s.marks);
// }
// }
// }
public class funOverloading {

    static class Demo {

        int add(int a, int b) {
            return a + b;
        }

        int add(int a, int b, int c) {
            return a + b + c;
        }

        double add(double a, double b) {
            return a + b;
        }
    }

    public static void main(String[] args) {

        Demo obj = new Demo(); // object create

        System.out.println(obj.add(2, 5)); // 2 parameter
        System.out.println(obj.add(2, 8, 8)); // 3 parameter
        System.out.println(obj.add(2.5, 3.5)); // double
    }
}
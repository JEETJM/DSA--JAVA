class Student {

    String name;

    static String college = "NIT";
}

public class StaticKeyworD {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Jeet";
        s2.name = "Rahul";

        System.out.println(s1.name + " " + s1.college);

        System.out.println(s2.name + " " + s2.college);
    }
}
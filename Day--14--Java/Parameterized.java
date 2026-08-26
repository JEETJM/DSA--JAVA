class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
    }
}

public class Parameterized {
    public static void main(String[] args) {

        Student s1 = new Student("Jeet", 21);
        Student s2 = new Student("Rahul", 22);

        s1.display();
        s2.display();
    }
}
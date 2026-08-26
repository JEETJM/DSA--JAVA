class Student {
    private String name;
    private int age;

    // Setter methods
    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class getterSetter {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Jeet");
        s1.setAge(21);

        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}
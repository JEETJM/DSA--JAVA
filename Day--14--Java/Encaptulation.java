class Student {
    private int marks;

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid Marks");
        }
    }

    public int getMarks() {
        return marks;
    }
}

public class Encaptulation {
    public static void main(String[] args) {
        Student s = new Student();

        s.setMarks(95);
        System.out.println(s.getMarks());

        s.setMarks(150);
    }
}
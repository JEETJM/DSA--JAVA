// package DSA--JAVA.Day--14--Java;

import java.util.Scanner;

public class ClassAndObject {
    String name;
    int age;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name  : ");
        String name = sc.nextLine();
        System.out.println(name + " is studying");
        sc.close();

    }

}

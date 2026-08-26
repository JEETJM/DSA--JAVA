// package DSA--JAVA.Day--8--Java;

import java.util.Scanner;

public class arrayCreate {
    public static void main(String[] args) {
        int marks[] = new int[20];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Subjects Marks : ");
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        marks[3] = sc.nextInt();
        marks[4] = sc.nextInt();
        System.out.println("Here your marks are : " + marks[0] + " " + marks[1] + " " + marks[2] + " " + marks[3] + " "
                + marks[4]);
        // persentage of marks ;;
        int persentage = (marks[1] + marks[2] + marks[3]) / 3;
        System.out.println("Persentage of marks 1 2 3  is  : " + persentage);

        // length of a array :
        System.out.println("Array of lenngth   is : " + marks.length);

        // MArks update //
        marks[0] = 500;
        System.out.println(marks[0]);
        // marks increase and decrease //
        marks[2] = marks[2] - 1;
        System.out.println(marks[2]);

        sc.close();

    }

}

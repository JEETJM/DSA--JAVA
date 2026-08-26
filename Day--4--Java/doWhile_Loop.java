import java.util.Scanner;

public class doWhile_Loop {
    public static void main(String[] main) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int store = sc.nextInt();
        int  counter = 1;
        do{
            System.out.println( "Hello World");
            counter++;

        }
        while(counter<=store);
        sc.close();

    }
}

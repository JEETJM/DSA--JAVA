import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        System.out.println("Here are your String input System :");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String :");
        String store = sc.nextLine();
        System.out.println("Here Are Your String Output with Length System : ");
        System.out.println(store +" And length of String is : " +store.length());
        sc.close();
    }
}
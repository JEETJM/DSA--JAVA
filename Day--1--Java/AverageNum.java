
// Question1:Inaprogram,input3numbers:A,BandC.Youhavetooutputtheaverageofthese 3 numbers
import java.util.*;

public class AverageNum {
    public static void main(String[] args) {
        float input1, input2, input3, Average;
        System.out.print("Enter First Number : ");
        Scanner sc1 = new Scanner(System.in);
        input1 = sc1.nextFloat();
        System.out.print("Enter Second Number : ");
        Scanner sc2 = new Scanner(System.in);
        input2 = sc2.nextFloat();
        System.out.print("Enter Third Number : ");
        Scanner sc3 = new Scanner(System.in);
        input3 = sc3.nextFloat();
        Average = (input1 + input2 + input3) / 3;
        System.out.print("Your Three Numbers of average is  : " + Average);
        sc1.close();
        sc2.close();
        sc3.close();
    }
}

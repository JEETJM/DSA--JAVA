
import java.util.*;

public class circleArea {
    public static void main(String[] args) {
        float Pi = 3.14159265359f;
        double Area;
        System.out.print("Please Enter Circle of Radius : ");
        Scanner Radius = new Scanner(System.in);
        float input = Radius.nextFloat();
        Area = Pi * input * input;
        System.out.print("Area Of Circle is : " + Area);
        Radius.close();
    }

}

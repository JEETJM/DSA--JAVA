
// Take input (cost of 3 items) using float
// Calculate total cost
// (Advanced) Add 18% GST
// Print final bill

import java.util.*;

public class BillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter cost of Pencil: ");
        float pencil = sc.nextFloat();

        System.out.print("Enter cost of Pen: ");
        float pen = sc.nextFloat();

        System.out.print("Enter cost of Eraser: ");
        float eraser = sc.nextFloat();

        // Total cost (without GST)
        float total = pencil + pen + eraser;

        // GST calculation (18%)
        float gst = total * 0.18f;

        // Final bill
        float finalBill = total + gst;

        // Output
        System.out.println("\n----- BILL -----");
        System.out.println("Total Cost (without GST): " + total);
        System.out.println("GST (18%): " + gst);
        System.out.println("Final Bill (with GST): " + finalBill);

        sc.close();
    }
}
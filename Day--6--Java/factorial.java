// package DSA--JAVA.Day--6--Java;

public class factorial {
    public static int facTorial(int n) {
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac = fac * i;

        }
        return fac;
    }

    public static void main(String[] args) {
        int sotre = facTorial(5);
        System.out.print("The Output is : " + sotre);
    }
}

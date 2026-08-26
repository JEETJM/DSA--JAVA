public class BinomialCoefficient {

    public static int facTorial(int n) {
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac = fac * i;
        }
        return fac;
    }

    public static int coeffBio(int n, int r) {
        if (r > n || r < 0) {
            System.out.println("Invalid input");
            return -1;
        }

        int nfac = facTorial(n);
        int rfac = facTorial(r);
        int nmirfac = facTorial(n - r);

        int nCr = nfac / (rfac * nmirfac);
        return nCr;
    }

    public static void main(String[] args) {
        System.out.print(coeffBio(5, 2));
    }
}
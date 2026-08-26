// public class PrimeNum {

//     public static boolean PrimeNumbr(int n) {
//         //corner cases  !!!!!
//         if (n <= 1) {
//             return false;
//         }

//         for (int i = 2; i <= n / 2; i++) {
//             if (n % i == 0) {
//                 return false;
//             }
//         }

//         return true;
//     }

//     public static void main(String[] args) {
//         System.out.println(PrimeNumbr(6));
//     }
// }











//OPTIMIZED WAY !!
public class PrimeNum {

    public static boolean PrimeNumbr(int n) {
        //corner cases  !!!!!
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; 
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(PrimeNumbr(7));
    }
}
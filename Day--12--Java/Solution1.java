public class Solution1 {
    public static void main(String args[]) {
        String str = "ShradhaDidi";
        String str1 = "ApnaCollege";
        String str2 = "ShradhaDidi";
        String str3 = "ApnaCollege".replace("l", "");
        System.out.println(str3);

        System.out.println(str.equals(str1) + " " + str.equals(str2));
    }
}
public class RemoveDuplicate {

    static void removeDup(String str, int index,
                          StringBuilder newStr,
                          boolean map[]) {

        // Base Case
        if(index == str.length()) {

            System.out.println(newStr);

            return;
        }

        // Current Character
        char currChar = str.charAt(index);

        // If duplicate
        if(map[currChar - 'a'] == true) {

            removeDup(str, index + 1, newStr, map);
        }

        // If not duplicate
        else {

            map[currChar - 'a'] = true;

            removeDup(str, index + 1,
                      newStr.append(currChar),
                      map);
        }
    }

    public static void main(String[] args) {

        String str = "jeetmondalllmo";

        removeDup(str, 0,
                  new StringBuilder(""),
                  new boolean[26]);
    }
}
import java.util.Scanner;

public class StringFunctionsDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter your first string: ");
        String str = sc.nextLine();

        System.out.print("Enter your second string: ");
        String str2 = sc.nextLine();

        System.out.println("\n==============================");
        System.out.println("JAVA STRING FUNCTIONS DEMO");
        System.out.println("==============================");

        // 1. length()
        System.out.println("\n1. length()");
        System.out.println("Length of first string = " + str.length());

        // 2. charAt()
        System.out.println("\n2. charAt(index)");
        if (str.length() > 0) {
            System.out.println("Character at index 0 = " + str.charAt(0));
        } else {
            System.out.println("String is empty, charAt cannot be used.");
        }

        // 3. toUpperCase()
        System.out.println("\n3. toUpperCase()");
        System.out.println("Uppercase = " + str.toUpperCase());

        // 4. toLowerCase()
        System.out.println("\n4. toLowerCase()");
        System.out.println("Lowercase = " + str.toLowerCase());

        // 5. trim()
        System.out.println("\n5. trim()");
        System.out.println("Before trim = [" + str + "]");
        System.out.println("After trim = [" + str.trim() + "]");

        // 6. equals()
        System.out.println("\n6. equals()");
        System.out.println("str.equals(str2) = " + str.equals(str2));

        // 7. equalsIgnoreCase()
        System.out.println("\n7. equalsIgnoreCase()");
        System.out.println("str.equalsIgnoreCase(str2) = " + str.equalsIgnoreCase(str2));

        // 8. compareTo()
        System.out.println("\n8. compareTo()");
        System.out.println("str.compareTo(str2) = " + str.compareTo(str2));

        // 9. compareToIgnoreCase()s
        System.out.println("\n9. compareToIgnoreCase()");
        System.out.println("str.compareToIgnoreCase(str2) = " + str.compareToIgnoreCase(str2));

        // 10. contains()
        System.out.println("\n10. contains()");
        System.out.print("Enter a word/letter to check contains: ");
        String search = sc.nextLine();
        System.out.println("str.contains(search) = " + str.contains(search));

        // 11. startsWith()
        System.out.println("\n11. startsWith()");
        System.out.print("Enter starting text to check: ");
        String startText = sc.nextLine();
        System.out.println("str.startsWith(startText) = " + str.startsWith(startText));

        // 12. endsWith()
        System.out.println("\n12. endsWith()");
        System.out.print("Enter ending text to check: ");
        String endText = sc.nextLine();
        System.out.println("str.endsWith(endText) = " + str.endsWith(endText));

        // 13. indexOf()
        System.out.println("\n13. indexOf()");
        System.out.print("Enter text to find first index: ");
        String findText = sc.nextLine();
        System.out.println("First index = " + str.indexOf(findText));

        // 14. lastIndexOf()
        System.out.println("\n14. lastIndexOf()");
        System.out.print("Enter text to find last index: ");
        String lastFindText = sc.nextLine();
        System.out.println("Last index = " + str.lastIndexOf(lastFindText));

        // 15. substring(start)
        System.out.println("\n15. substring(start)");
        if (str.length() >= 2) {
            System.out.println("Substring from index 1 = " + str.substring(1));
        } else {
            System.out.println("String too short for substring(1).");
        }

        // 16. substring(start, end)
        System.out.println("\n16. substring(start, end)");
        if (str.length() >= 4) {
            System.out.println("Substring from index 1 to 4 = " + str.substring(1, 4));
        } else {
            System.out.println("String too short for substring(1, 4).");
        }

        // 17. replace()
        System.out.println("\n17. replace()");
        System.out.print("Enter old character/text: ");
        String oldText = sc.nextLine();

        System.out.print("Enter new character/text: ");
        String newText = sc.nextLine();

        System.out.println("After replace = " + str.replace(oldText, newText));

        // 18. replaceFirst()
        System.out.println("\n18. replaceFirst()");
        System.out.println("replaceFirst old with new = " + str.replaceFirst(oldText, newText));

        // 19. replaceAll()
        System.out.println("\n19. replaceAll()");
        System.out.println("replaceAll old with new = " + str.replaceAll(oldText, newText));

        // 20. split()
        System.out.println("\n20. split()");
        System.out.print("Enter separator for split, example space or comma: ");
        String separator = sc.nextLine();

        String[] parts = str.split(separator);

        System.out.println("After split:");
        for (int i = 0; i < parts.length; i++) {
            System.out.println("Part " + i + " = " + parts[i]);
        }

        // 21. concat()
        System.out.println("\n21. concat()");
        System.out.println("Concatenation = " + str.concat(str2));

        // 22. isEmpty()
        System.out.println("\n22. isEmpty()");
        System.out.println("str.isEmpty() = " + str.isEmpty());

        // 23. isBlank()
        System.out.println("\n23. isBlank()");
        System.out.println("str.isBlank() = " + str.isBlank());

        // 24. valueOf()
        System.out.println("\n24. String.valueOf()");
        int number = 123;
        String numberString = String.valueOf(number);
        System.out.println("Integer number = " + number);
        System.out.println("Converted string = " + numberString);

        // 25. toCharArray()
        System.out.println("\n25. toCharArray()");
        char[] chars = str.toCharArray();

        System.out.println("Characters:");
        for (int i = 0; i < chars.length; i++) {
            System.out.println("Index " + i + " = " + chars[i]);
        }

        // 26. matches()
        System.out.println("\n26. matches()");
        System.out.println("Only alphabets? " + str.matches("[a-zA-Z ]+"));
        System.out.println("Only digits? " + str.matches("[0-9]+"));

        // 27. repeat()
        System.out.println("\n27. repeat()");
        System.out.println("Repeat 3 times = " + str.repeat(3));

        // 28. strip()
        System.out.println("\n28. strip()");
        System.out.println("After strip = [" + str.strip() + "]");

        // 29. stripLeading()
        System.out.println("\n29. stripLeading()");
        System.out.println("After stripLeading = [" + str.stripLeading() + "]");

        // 30. stripTrailing()
        System.out.println("\n30. stripTrailing()");
        System.out.println("After stripTrailing = [" + str.stripTrailing() + "]");

        // 31. format()
        System.out.println("\n31. String.format()");
        String formatted = String.format("Name: %s, Marks: %d", str.trim(), 95);
        System.out.println(formatted);

        // 32. join()
        System.out.println("\n32. String.join()");
        String joined = String.join(" - ", "Java", "String", "Functions");
        System.out.println(joined);

        sc.close();
    }
}
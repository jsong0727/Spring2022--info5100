import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------------------------");
        String str = "abcdefg";
        String str1 = "bcdefga";
        System.out.println(isPalingdrome(str));
        System.out.println("---------------------------------------");
        System.out.println(isUnique(str));
        System.out.println("---------------------------------------");
        System.out.println(hasDuplicates(str));
        System.out.println("---------------------------------------");
        System.out.println(areAnagrams(str, str1));
        System.out.println("---------------------------------------");
        System.out.println(isLeapYear(2008));
        Box box = new Box(2, 3, 4);
        System.out.println(box.getVolume());
        System.out.println("---------------------------------------");

        Book book1 = new Book("Harry potter", 2222, "Magic", 100);
        System.out.println(book1.getBookID());
        System.out.println("---------------------------------------");
        System.out.println(canConstruct("abcd", "zadfeabcd"));
    }
    //Question 1: Write a program find if String is Palindrome?

    public static boolean isPalingdrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        char[] arr = str.toCharArray();
        while (i < j) {
            if (arr[i] != arr[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    //Question2: Write a program to check if a string has all unique characters.
    public static boolean isUnique(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    //Question 3. Write a program to check if string contains duplicates
    public static boolean hasDuplicates(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;

    }

    //Question 4: Write a program to check if two strings are anagrams. Anagrams are strings which can be made by rearranging characters in string.
    public static boolean areAnagrams(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        if (arr1.length != arr2.length) {
            return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    //Question 5:  Write a program to determine whether the year is a leap year or not.
    //Leap Years are any year that can be evenly divided by 4.  A year that is evenly divisible by 100 is a leap year only if it is also evenly divisible by 400.
    public static boolean isLeapYear(int n) {
        if (n % 4 == 0) {
            if (n % 100 == 0) {
                if (n % 400 == 0) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    ///Question 6: Write a program to calculate the monthly telephone bills as per the following rule:
    /*Minimum $ 200 for up to 100 calls.
     *Plus $ 0.60 per call for next 50 calls.
     *Plus $ 0.50 per call for next 50 calls.
     *Plus $ 0.40 per call for any call beyond 200 calls.
     Use Switch Statement in the function.
     * */

    public static float calculateBill(int calls) {
        float baseRate = 200;
        float bill = 0;
        if (calls <= 100) {
            bill = baseRate;
        } else if (calls <= 150) {
            bill = baseRate + (calls - 100) * 0.6f;
        } else if (calls <= 200) {
            bill = baseRate + 50 * 0.6f + (calls - 150) * 0.5f;
        } else {
            bill = baseRate + 50 * 0.6f + 50 * 0.5f + (calls - 200) * 0.4f;
        }
        return bill;
    }

    //Question 7: Given two strings ransomNote and magazine, return true if ransomNote can be constructed from magazine and false otherwise.
    //Each letter in magazine can only be used once in ransomNote.
    //?? not quite sure
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            arr[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (--arr[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;

    }


    //Question 8 : Write a program that prompts the user’s grade. Your program should display the corresponding meaning of grade as per the following table
    /* A Excellent
     * B Good
     * C Average
     * D Deficient
     * F Failing
     */
    public static void showGrade(String grade) {
        if (Objects.equals(grade, "A")) {
            System.out.println(grade + ": Excellent");
        } else if (Objects.equals(grade, "B")) {
            System.out.println(grade + ": Good");
        } else if (Objects.equals(grade, "C")) {
            System.out.println(grade + ": Average");
        } else if (Objects.equals(grade, "D")) {
            System.out.println(grade + ": Deficient");
        } else {
            System.out.println(grade + ": Failing");
        }
    }
}

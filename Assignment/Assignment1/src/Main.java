import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "abcdefg";
        String str1 = "infeow";
        String str2 = "niewof";
        System.out.println(areAnagrams(str1, str2));

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
    

//    Question 6: Write a program to calculate the monthly telephone bills as per the following rule: Minimum $ 200 for up to 100 calls.
//    Plus $ 0.60 per call for next 50 calls.
//    Plus $ 0.50 per call for next 50 calls.
//    Plus $ 0.40 per call for any call beyond 200 calls.
//
//    Use Switch Statement in the function.
//
//    Question 7: Given two strings ransomNote and magazine, return true if ransomNote can be constructed from magazine and false otherwise.
//
//    Each letter in magazine can only be used once in ransomNote.

//    Question 8 : Write a program that prompts the user’s grade. Your program should display the corresponding meaning of grade as per the following table
}

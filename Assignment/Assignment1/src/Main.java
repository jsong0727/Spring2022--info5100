public class Main {
    public static void main(String[] args) {
        String string = "aba";
        System.out.println(isPalingdrome(string));

    }
    ///Question 1: Write a program find if String is Palindrome?

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
}

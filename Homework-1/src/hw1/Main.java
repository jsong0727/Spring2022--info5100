package hw1;

public class Main {

    public static void main(String[] args) {
        String str = "Jiayin";
        System.out.println(reverseString(str));

    }

    //q1 reverse a string
    private static String reverseString(String str) {
        if (str == null) {
            return null;
        }
        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(arr);
    }
}

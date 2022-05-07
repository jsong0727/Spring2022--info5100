package Question2;

public class StringCompression {
    public static void main(String[] args) {
        String input = "aabcccccaaa";
        String input2 = "abcdef";
        System.out.println(compress(input));
        System.out.println(compress(input2));
    }

    public static String compress(String text) {
        int length = text.length();
        if (length > 2) {
            String compressedText = "";
            char lastChar = text.charAt(0);
            int count = 1;
            for (int i = 1; i < length; i++) {
                if (text.charAt(i) == lastChar) {
                    count += 1;
                } else {
                    compressedText += lastChar + Integer.toString(count);
                    lastChar = text.charAt(i);
                    count = 1;
                }
            }
            compressedText += lastChar + Integer.toString(count);
            if (compressedText.length() < length) {
                return compressedText;
            }
        }
        return text;
    }
}

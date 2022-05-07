package Question4;

import java.util.Arrays;

public class SumZero {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(5)));
        System.out.println(Arrays.toString(sumZero(10)));
    }

    public static int[] sumZero(int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; ++i) {
            res[i] = i * 2 - n + 1;
        }
        return res;
    }

}

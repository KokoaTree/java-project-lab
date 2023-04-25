package week2.day2;

import java.util.Arrays;

public class ArraysToString {
    public static void main(String[] args) {
        int[] iArr = new int[3];
        iArr[0] = 2;
        iArr[1] = 4;
        iArr[2] = 7;

        System.out.println(iArr);
        System.out.println(Arrays.toString(iArr));
    }
}

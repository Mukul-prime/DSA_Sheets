package ArrayOperation;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public String reverse (int n ){
        int[] digits = Integer.toString(n)
                .chars()
                .map(Character::getNumericValue)
                .toArray();

        int[] arr = new int[digits.length];
        if (arr.length + 1 >= 0) {
            System.arraycopy(digits, 0, arr, 0, arr.length + 1);
        }
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

    }
}

package PARKING_AREA;

import java.util.Scanner;


class Solution {
    public void pattern1(int x, int y) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void pattern2(int x, int y) {
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public void pattern3(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void pattern4(int x) {
        int a = 1;
        for (int i = 1; i <= x; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
            }
            a += 1;
            System.out.println();
        }
    }


    public void pattern5(int x) {
        for (int i = x; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void pattern6(int x) {
        for(int i = x ; i>=1 ; i--){
            for(int j = 1 ;j<=i ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public void pattern7(int x) {

    }
}

public class Parks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int m = sc.nextInt();
        Solution s = new Solution();
//        s.pattern1(n, m);
//        s.pattern2(n, m);
//        s.pattern3(n);
//        s.pattern4(n);
//        s.pattern5(n);
//        s.pattern6(n);

    }
}

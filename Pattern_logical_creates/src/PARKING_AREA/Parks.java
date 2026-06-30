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

    public void pattern2(int x) {
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
        for (int i = x; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void pattern7(int x) {

        for (int i = 0; i < x; i++) {

            for (int creator_space = 0; creator_space < x - i - 1; creator_space++) {
                System.out.print("  ");
            }

            for (int plant = 0; plant < 2 * i + 1; plant++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public void pattern8(int x) {
        for (int i = 0; i < x; i++) {

            for (int space = 0; space < i; space++) {
                System.out.print("  ");
            }

            for (int star = 0; star < 2 * (x - i) - 1; star++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }


    public void pattern12(int x) {
      int s = 1;
      for(int i = 0 ; i<x;i++){
          if(i%2==0) s=1;
          else s=0;
          for(int j = 0 ; j<=i ; j++){
              System.out.print(s+" ");
              s=1-s;
          }
          System.out.println();
      }

    }
}

public class Parks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int m = sc.nextInt();
        Solution s = new Solution();
//        s.pattern1(n, m);
//        s.pattern2(n);
//        s.pattern3(n);
//        s.pattern4(n);
//        s.pattern5(n);
//        s.pattern6(n);
//        s.pattern7(n);
//        s.pattern8(n);
//          s.pattern9(n);
        s.pattern12(n);



    }
}

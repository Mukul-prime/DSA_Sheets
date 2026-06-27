package InputOutput;

import java.util.Scanner;

class Solution {
    public void printNumber(Scanner sc) {
        int a = sc.nextInt();
        System.out.println(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution obj = new Solution();
        obj.printNumber(sc);
    }
}
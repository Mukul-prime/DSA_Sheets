import java.util.Scanner;

class Solution {
    public  int number_Digitts(int n) {
        String s = String.valueOf(n);
        return s.length();
    }
}


public class Count_of_All_digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Solution obj = new Solution();
        System.out.println(obj.number_Digitts(n));



    }
}
package Two_Sum;

import java.util.Scanner;


class Solution{
    public boolean printter(int[] a , int n ,int k){
        int start =0 ;
        int end = n-1;
        while (start<=end){
            int sum = a[start] + a[end];
            if(sum == k){
               return true;
            }else if(sum<k){
                start++;
            }
            else{
                end--;
            }
        }
       return false;
    }
}

public class Two_Sum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] m = new int[n];
        for(int i=0;i<n;i++){
            m[i]=input.nextInt();
        }

        Solution s = new Solution();
       boolean er =   s.printter(m,n,k);
        if(er){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}

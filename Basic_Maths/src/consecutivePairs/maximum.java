package consecutivePairs;

import java.util.Scanner;

class Solution{
    public int counter(int[] a , int n ){
        int count = 0 ;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]==1){

               count++;
                max = Math.max(max, count);
            }
//            count++;
            else{

                count = 0;
            }
        }
        return max;
    }
}


public class maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int a = 0; a < n; a++){
            arr[a]=sc.nextInt();
        }
        Solution obj = new Solution();
        int result = obj.counter(arr, n);
        System.out.println(result);

    }
}

package Move_Zero_to_end;

import java.util.ArrayList;
import java.util.Scanner;

class Solution{
    public int[] mover(int[] a , int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i< n ;i++){
            if(a[i]!=0){
                list.add(a[i]);
            }
        }
        int sizer =a.length-list.size();
        for(int i = 0 ; i< sizer ; i++){
            list.add(0);
        }
        return list.stream().mapToInt(x->x).toArray();
    }
}

public class Move_Zero_to_end {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Solution sol = new Solution();
        int[] result =sol.mover(arr, n);
        for(int i : result){
            System.out.print(i+" ");
        }
    }
}

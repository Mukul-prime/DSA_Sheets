package kaden_s_Algorithm;

import java.util.Scanner;


class Work{
    public int counts(int[] a , int n ){
        int currsum = a[0];
        int maxsum = a[0];
        for(int i = 1 ; i< n ; i++){
            currsum = Math.max(a[i],currsum+ a[i]);
            maxsum = Math.max(maxsum,currsum);
        }
        return maxsum;
    }
}

public class KadenceAlogo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr =  new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = input.nextInt();

        }
        Work work = new Work();
        System.out.println(work.counts(arr, n));

    }
}

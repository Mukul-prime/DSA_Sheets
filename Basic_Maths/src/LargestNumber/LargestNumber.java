package LargestNumber;

import java.util.Scanner;

//Example 1:
//Input:
//arr[] = {2, 5, 1, 3, 0}
//Output:
//        5
//Explanation:
//
//        5 is the largest element in the array.
//
//        Example 2:
//Input:
//arr[] = {8, 10, 5, 7, 9}
//Output:
//        10
//Explanation:
//
//        10 is the largest element in the array.


class Solution{

    public int largest_Number(int[] arr){
        int max = arr[0];
        int idx = 0;
        for(int i =1 ; i <arr.length;i++){
            if(arr[i]>max){
                idx=i;
                max = arr[i];
            }
        }
        return max;
    }
}

public class LargestNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();

        int[] arr = new int[number];

        for (int i = 0; i < number; i++) {
            arr[i] = console.nextInt();
        }

        Solution obj = new Solution();
        System.out.println(obj.largest_Number(arr));

    }
}

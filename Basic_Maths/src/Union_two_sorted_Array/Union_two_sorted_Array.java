package Union_two_sorted_Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




class Solution{
    public int[] newMade(int[] arr, int n, int[] brr, int m) {
        List<Integer> list = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < n && j < m) {

            if (arr[i] < brr[j]) {
                if (list.isEmpty() || list.get(list.size() - 1) != arr[i]) {
                    list.add(arr[i]);
                }
                i++;
            }
            else if (arr[i] > brr[j]) {
                if (list.isEmpty() || list.get(list.size() - 1) != brr[j]) {
                    list.add(brr[j]);
                }
                j++;
            }
            else {
                if (list.isEmpty() || list.get(list.size() - 1) != arr[i]) {
                    list.add(arr[i]);
                }
                i++;
                j++;
            }
        }

        while (i < n) {
            if (list.isEmpty() || list.get(list.size() - 1) != arr[i]) {
                list.add(arr[i]);
            }
            i++;
        }

        while (j < m) {
            if (list.isEmpty() || list.get(list.size() - 1) != brr[j]) {
                list.add(brr[j]);
            }
            j++;
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

public class Union_two_sorted_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size1 of the array");
        int size1 = input.nextInt();
//        System.out.println("Enter the elements of the array");
        int [] a = new int[size1];
        System.out.println("Enter the elements of the array");
        for(int i = 0 ; i < size1 ; i++){
            a[i] = input.nextInt();
        }
        System.out.println("Enter the size2 elements of the array");
        int size2 = input.nextInt();
//        System.out.println("Enter the elements of the array");
        int [] b = new int[size2];
        System.out.println("Enter the elements of the array");
        for(int i = 0 ; i < size2 ; i++){
            b[i] = input.nextInt();
        }

        Solution s = new Solution();
        int[] result = s.newMade(a,size1,b,size2);
        for(int i = 0 ; i < size1 ; i++){
            System.out.print(result[i]+" ");
        }


    }
}

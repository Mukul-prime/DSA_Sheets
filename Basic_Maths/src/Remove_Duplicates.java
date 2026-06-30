//Input: arr[]=[1,1,2,2,2,3,3]
//Output: [1,2,3,_,_,_,_]
//Explanation: Total number of unique elements are 3, i.e[1,2,3] and Therefore return 3 after assigning [1,2,3] in the beginning of the array.
//Input: arr[]=[1,1,1,2,2,3,3,3,3,4,4]
//Output: [1,2,3,4,_,_,_,_,_,_,_]
//Explanation: Total number of unique elements are 4, i.e[1,2,3,4] and Therefore return 4 after assigning [1,2,3,4] in the beginning of the array.


//import LargestNumber.Solution;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import java.util.*;

class Backup {
    public int[] booster(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}




public class Remove_Duplicates {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();

        int[] arr = new int[number];

        for (int i = 0; i < number; i++) {
            arr[i] = console.nextInt();
        }
        Backup obj = new Backup();
        int[] result = obj.booster(arr);


        System.out.println(Arrays.toString(result));


    }
}

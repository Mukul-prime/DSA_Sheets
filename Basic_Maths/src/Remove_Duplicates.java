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
    // Function to remove duplicates from sorted array in-place
    public int removeDuplicates(int[] nums) {
        // If array is empty, return 0
        if (nums.length == 0) return 0;

        // Pointer for last unique element
        int i = 0;

        // Start from second element
        for (int j = 1; j < nums.length; j++) {
            // If new unique element is found
            if (nums[j] != nums[i]) {
                // Move unique position forward
                i++;
                // Place new unique element
                nums[i] = nums[j];
            }
        }

        // i is last index of unique element, count = i + 1
        return i + 1;
    }
}



public class Remove_Duplicates {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        Backup sol = new Backup();
        int k = sol.removeDuplicates(nums);

        System.out.println("Unique count = " + k);
        System.out.print("Array after removing duplicates: ");
        for (int x = 0; x < k; x++) {
            System.out.print(nums[x] + " ");
        }


    }
}

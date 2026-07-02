package Linear_Search;

import java.util.Scanner;




class Backup{
    public boolean finder(int[] a, int n , int k){
        for(int i = 0 ; i<n ; i++){
            if(a[i]==k){
                return true;
            }
        }
        return false;
    }
}

public class linear_search {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        int target = input.nextInt();
        for(int a = 0; a < n; a++){
            arr[a] = input.nextInt();
        }
        Backup obj = new Backup();
        if(obj.finder(arr,n,target)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }


    }
}

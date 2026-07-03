package Appears_One;

//import consecutivePairs.Solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



class Nodes{
    public int ans(int[] arr,int n ){
        int ans = 0 ;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : arr){
            if(!map.isEmpty()&&map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }

       for(Map.Entry<Integer,Integer> maps : map.entrySet()){
           if(maps.getValue()==1){
               ans=maps.getKey();
           }

       }

       return ans;
    }
}

public class AppaearsOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int[] arr =  new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Nodes obj = new Nodes();
        int ans = obj.ans(arr, n);
        System.out.println(ans);

    }
}

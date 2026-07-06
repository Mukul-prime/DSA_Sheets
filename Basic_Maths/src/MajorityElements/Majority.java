package MajorityElements;

import java.util.*;


class Work{
    public int Worker(int[] a , int n){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i : a){
            if(!map.isEmpty() && map.containsKey(i) ){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }

     return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();

    }
}


public class Majority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int[]  arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
        }

        Work work = new Work();
        System.out.println(work.Worker(arr,t));
    }
}

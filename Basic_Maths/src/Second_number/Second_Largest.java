package Second_number;

import LargestNumber.LargestNumber;

import java.util.Scanner;

class Solutions{

    public String Second_Largest(int[] arr){
        int max = arr[0];
        int idx = 0;
        for(int i =1 ; i <arr.length;i++){
            if(arr[i]>max){
                idx=i;
                max = arr[i];
            }
        }

        int sed = arr[0] ;
        for(int i = 0 ; i <arr.length; i++){
            if(i!=idx){
                if(arr[i]>sed){
                    sed = arr[i];
                }
            }
        }
        return " "+sed+" "+max;
    }
}

public class Second_Largest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();

        int[] arr = new int[number];

        for (int i = 0; i < number; i++) {
            arr[i] = console.nextInt();
        }

        Solutions obj = new Solutions();
        System.out.println(obj.Second_Largest(arr));

    }
}

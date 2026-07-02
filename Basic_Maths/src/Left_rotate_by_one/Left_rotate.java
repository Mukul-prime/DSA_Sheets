package Left_rotate_by_one;

import java.util.Scanner;


class Backup {
    public int[] leftroatebyone(int[] a, int n,int k) {
        for(int j = 0 ; j<k;j++ ){
            if (n == 0) {
                return new int[0];
            }
            int temp = a[0];
            int idx = 0;
            for (int i = 1; i < n; i++) {
                a[idx] = a[i];
                idx++;
            }
            a[n - 1] = temp;
        }
        return a;


    }

}

public class Left_rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Backup sol = new Backup();
        int[] result = sol.leftroatebyone(arr,n,k);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

}

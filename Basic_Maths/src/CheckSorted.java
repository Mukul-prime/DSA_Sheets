import java.util.Scanner;



class sortedCheck {

    public boolean check(int[] arr){
        for(int i = 1 ; i< arr.length;i++){
            if(arr[i-1]<arr[i]){
                return true;
            }

        }
        return false;
    }

}



public class CheckSorted {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();

        int[] arr = new int[number];

        for (int i = 0; i < number; i++) {
            arr[i] = console.nextInt();
        }

        sortedCheck obj = new sortedCheck();
        System.out.println(obj.check(arr));



    }
}

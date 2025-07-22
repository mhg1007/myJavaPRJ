package baekjoon;

import java.util.Scanner;

public class B2947 {
    public static void wdpc(int[] arr, int pos1, int pos2){
        if(arr[pos1]>arr[pos2]){
            int tmp=arr[pos1];
            arr[pos1]=arr[pos2];
            arr[pos2]=tmp;
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                if(i!=arr.length-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr={s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()};
        while(!(arr[0]==1 && arr[1]==2 && arr[2]==3 && arr[3]==4 && arr[4]==5)){
            wdpc(arr,0,1);
            wdpc(arr,1,2);
            wdpc(arr,2,3);
            wdpc(arr,3,4);
        }
    }
}

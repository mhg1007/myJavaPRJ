package baekjoon;

import java.util.Scanner;

public class B2920 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr=new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i]=s.nextInt();
        }
        boolean chk=true;
        if(arr[0]==1){
            for (int i = 1; i < 8; i++) {
                if(arr[i-1]>arr[i]){
                    chk=false;
                    break;
                }
            }
        }
        else if(arr[0]==8){
            for (int i = 1; i < 8; i++) {
                if(arr[i-1]<arr[i]){
                    chk=false;
                    break;
                }
            }
        }
        else{
            chk=false;
        }
        System.out.print(chk?arr[0]==1?"ascending":"descending":"mixed");
    }
}

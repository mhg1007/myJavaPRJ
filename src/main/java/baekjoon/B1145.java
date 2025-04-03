package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B1145 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr=new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        for (int i = arr[0];  ; i++) {
            int chk=0;
            for (int k : arr) {
                if (i % k == 0) {
                    chk++;
                }
            }
            if(chk>=3){
                System.out.print(i);
                break;
            }
        }
    }
}

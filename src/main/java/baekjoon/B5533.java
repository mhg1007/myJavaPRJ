package baekjoon;

import java.util.Scanner;

public class B5533 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int[][] arr=new int[N][4];
        for (int i = 0; i < N; i++) {
            arr[i][0]=s.nextInt();
            arr[i][1]=s.nextInt();
            arr[i][2]=s.nextInt();
            arr[i][3]=arr[i][0]+arr[i][1]+arr[i][2];
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if(j!=k && arr[j][i]==arr[k][i]){
                        arr[j][3]-=arr[j][i];
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i][3]);
        }
    }
}

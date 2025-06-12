package baekjoon;

import java.util.Scanner;

public class B2246 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int[][] arr=new int[N][2];
        for (int i = 0; i < N; i++) {
            arr[i][0]=s.nextInt();//거리
            arr[i][1]=s.nextInt();//숙박비
        }
        int cnt=0;
        for (int i = 0; i < N; i++) {
            boolean flag=true;
            for (int j = 0; j < N; j++) {
                if((arr[i][0]>arr[j][0] && arr[i][1]>=arr[j][1])
                        ||(arr[i][1]>arr[j][1] && arr[i][0]>=arr[j][0])){
                    flag=false;
                    break;
                }
            }
            if(flag){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}

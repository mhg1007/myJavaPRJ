package baekjoon;

import java.util.Scanner;

public class B20114 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int H=s.nextInt();
        int W=s.nextInt();
        char[][] arr=new char[H][N*W];
        for (int i = 0; i < H; i++) {
            arr[i]=s.next().toCharArray();
        }
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < N; i++) {
            boolean chk=false;
            letter:
            for (int j = 0; j < H; j++) {
                for (int k = i*W; k < (i+1)*W; k++) {
                    if(arr[j][k]!='?'){
                        sb.append(arr[j][k]);
                        chk=true;
                        break letter;
                    }
                }
            }
            if(!chk){
                sb.append('?');
            }
        }
        System.out.print(sb);
    }
}

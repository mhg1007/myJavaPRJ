package baekjoon;

import java.util.Scanner;

public class B1236 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        int nd1=0;
        char[][] arr=new char[N][M];
        for (int i = 0; i < N; i++) {
            String flr=s.next();
            if(!flr.contains("X")){
                nd1++;
            }
            arr[i]=flr.toCharArray();
        }
        int nd2=0;
        for (int i = 0; i < M; i++) {
            boolean chk=false;
            for (int j = 0; j < N; j++) {
                if(arr[j][i]=='X'){
                    chk=true;
                    break;
                }
            }
            if(!chk){
                nd2++;
            }
        }
        System.out.print(Math.max(nd1,nd2));
    }
}

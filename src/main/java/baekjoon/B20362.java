package baekjoon;

import java.util.Objects;
import java.util.Scanner;

public class B20362 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        String cor=s.next();
        String[][] chat=new String[N][2];
        int corpo=0;
        for (int i = 0; i < N; i++) {
            chat[i][0]=s.next();
            chat[i][1]=s.next();
            if(Objects.equals(chat[i][0], cor)){
                corpo=i;
            }
        }
        String corans=chat[corpo][1];
        int count=0;
        for (int i = corpo-1; i >=0; i--) {
            if(Objects.equals(chat[i][1],corans)){
                count++;
            }
        }
        System.out.print(count);
    }
}

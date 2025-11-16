package baekjoon;

import java.util.Scanner;

public class B10599 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(true){
            int[] b={s.nextInt(), s.nextInt()};
            int[] d={s.nextInt(), s.nextInt()};
            if(b[0]==0&&b[1]==0&&d[0]==0&&d[1]==0)break;
            System.out.println((d[0]-b[1])+" "+(d[1]-b[0]));
        }
    }
}

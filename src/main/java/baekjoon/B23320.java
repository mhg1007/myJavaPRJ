package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B23320 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(s.nextInt());
        }
        int X=s.nextInt();
        int Y=s.nextInt();
        int sx=N*X/100;
        int sy=0;
        for(int a:list){
            if(a>=Y){
                sy++;
            }
        }
        System.out.print(sx+" "+sy);
    }
}

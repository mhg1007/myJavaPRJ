package baekjoon;

import java.util.Scanner;

public class B1977 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int M=s.nextInt();
        int N=s.nextInt();
        int sum=0;
        int min=0;
        for (int i = M; i <= N; i++) {
            if(Math.sqrt(i)%1==0){
                if(sum==0){
                    min=i;
                }
                sum+=i;
            }
        }
        System.out.print(sum!=0?sum+"\n"+min:-1);
    }
}

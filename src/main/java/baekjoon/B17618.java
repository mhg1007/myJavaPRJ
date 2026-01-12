package baekjoon;

import java.util.Scanner;

public class B17618 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        if(N<10){
            System.out.print(N);
        }
        else{
            int cnt=0;
            for (int i = 1; i <= N; i++) {
                int b=0;
                for(char c:String.valueOf(i).toCharArray()){
                    b+=Character.getNumericValue(c);
                }
                if(i%b==0){
                    cnt++;
                }
            }
            System.out.print(cnt);
        }
    }
}

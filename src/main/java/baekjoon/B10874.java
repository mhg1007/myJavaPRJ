package baekjoon;

import java.util.Scanner;

public class B10874 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < N; i++) {
            boolean chk=true;
            for (int j = 0; j < 10; j++) {
                int ans=s.nextInt();
                if(ans!=j%5+1){
                    chk=false;
                }
            }
            if(chk){
                sb.append(i+1).append("\n");
            }
        }
        sb.setLength(sb.length()-1);
        System.out.print(sb);
    }
}

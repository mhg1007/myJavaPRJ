package baekjoon;

import java.util.Scanner;

public class B6321 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < N; i++) {
            String str=s.next();
            if(i!=0){
                sb.append("\n");
            }
            sb.append("String #").append(i+1).append("\n");
            for (int j = 0; j < str.length(); j++) {
                char hal= (char) (str.charAt(j)!=90?str.charAt(j)+1:65);
                sb.append(hal);
            }
            if(i!=N-1){
                sb.append("\n");
            }
        }
        System.out.print(sb);
    }
}

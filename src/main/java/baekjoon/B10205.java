package baekjoon;

import java.util.Scanner;

public class B10205 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int K=s.nextInt();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < K; i++) {
            if(i!=0){
                sb.append("\n");
            }
            sb.append("Data Set ").append(i+1).append(":\n");
            int h=s.nextInt();
            for(char a:s.next().toCharArray()){
                h+= a=='c'?1:-1;
            }
            sb.append(h).append("\n");
        }
        sb.setLength(sb.length()-1);
        System.out.print(sb);
    }
}

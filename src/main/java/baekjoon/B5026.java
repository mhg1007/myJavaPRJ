package baekjoon;

import java.util.Scanner;

public class B5026 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < N; i++) {
            if(i!=0){
                sb.append("\n");
            }
            String qst=s.next();
            if(qst.equals("P=NP")){
                sb.append("skipped");
            }
            else{
                int ans=Integer.parseInt(qst.substring(0,qst.indexOf("+")))+Integer.parseInt(qst.substring(qst.indexOf("+")+1));
                sb.append(ans);
            }
        }
        System.out.print(sb);
    }
}

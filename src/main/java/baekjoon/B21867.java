package baekjoon;

import java.util.Scanner;

public class B21867 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        String org=s.next();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < N; i++) {
            if(org.charAt(i)!='J'&&org.charAt(i)!='A'&&org.charAt(i)!='V'){
                sb.append(org.charAt(i));
            }
        }
        System.out.print(sb.toString().isEmpty()?"nojava":sb);
    }
}

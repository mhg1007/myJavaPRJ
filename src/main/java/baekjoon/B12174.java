package baekjoon;

import java.util.Scanner;

public class B12174 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int B=s.nextInt();
            String b=s.next();
            String[] arr=new String[B];
            for (int j = 0; j < B; j++) {
                String bit=b.substring(j*8,(j+1)*8);
                StringBuilder sb=new StringBuilder();
                for (int k = 0; k < 8; k++) {
                    if(bit.charAt(k)=='O'){
                        sb.append(0);
                    }
                    else if(bit.charAt(k)=='I'){
                        sb.append(1);
                    }
                }
                arr[j]=sb.toString();
            }
            StringBuilder sb=new StringBuilder("Case #");
            sb.append(i+1).append(": ");
            for(String a:arr){
                sb.append((char)Integer.parseInt(a,2));
            }
            System.out.println(sb);
        }
    }
}

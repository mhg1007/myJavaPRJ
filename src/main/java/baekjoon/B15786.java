package baekjoon;

import java.util.Scanner;

public class B15786 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        String org=s.next();
        for (int i = 0; i < M; i++) {
            String pst=s.next();
            int pos=0;
            int chk=0;
            for (int j = 0; j < pst.length(); j++) {
                if(pos<N && pst.charAt(j)==org.charAt(pos)){
                    chk++;
                    pos++;
                }
            }
            System.out.println(chk==org.length()?"true":"false");
        }
    }
}

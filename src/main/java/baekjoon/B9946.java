package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B9946 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int seq=0;
        while(true){
            String a=s.next();
            String b=s.next();
            if(a.equals("END")&&b.equals("END")) break;
            seq++;
            StringBuilder sb=new StringBuilder();
            sb.append("Case ").append(seq).append(": ");
            boolean chk=true;
            if(a.length()!=b.length()){
                chk=false;
            }
            else {
                char[] ar = a.toCharArray();
                char[] br = b.toCharArray();
                Arrays.sort(ar);
                Arrays.sort(br);
                for (int i = 0; i < ar.length; i++) {
                    if (ar[i]!=br[i]){
                        chk=false;
                        break;
                    }
                }
            }
            sb.append(chk?"same":"different");
            System.out.println(sb);
        }
    }
}

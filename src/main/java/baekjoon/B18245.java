package baekjoon;

import java.util.Scanner;

public class B18245 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int seq=2;
        while(true){
            String org=s.nextLine();
            if(org.equals("Was it a cat I saw?")) break;
            StringBuilder sb=new StringBuilder();
            for (int i = 0; i < org.length(); i+=seq) {
                sb.append(org.charAt(i));
            }
            System.out.println(sb);
            seq++;
        }
    }
}

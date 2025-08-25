package baekjoon;

import java.util.Scanner;

public class B4740 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while (true){
            String str=s.nextLine();
            if(str.equals("***")) break;
            StringBuilder sb=new StringBuilder();
            sb.append(str);
            sb.reverse();
            System.out.println(sb);
        }
    }
}

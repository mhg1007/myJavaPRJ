package baekjoon;

import java.util.Scanner;

public class B3765 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        while (s.hasNextLine()){
            String str=s.nextLine();
            if(str.isEmpty()) break;
            sb.append(str).append("\n");
        }
        System.out.print(sb);
    }
}

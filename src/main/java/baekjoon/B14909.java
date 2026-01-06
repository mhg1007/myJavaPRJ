package baekjoon;

import java.util.Scanner;

public class B14909 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] nms = s.nextLine().split(" ");
        int nt=0;
        for(String nm : nms) {
            if(nm.contains("-")||nm.equals("0")){
                nt++;
            }
        }
        System.out.print(nms.length-nt);
    }
}

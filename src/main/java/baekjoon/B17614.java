package baekjoon;

import java.util.Scanner;

public class B17614 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N=s.nextInt();
        int cnt=0;
        for (int i = 1; i <= N; i++) {
            String seq=String.valueOf(i);
            if(seq.contains("3")||seq.contains("6")||seq.contains("9")) {
                for (int j = 0; j < seq.length(); j++) {
                    if(seq.charAt(j)=='3'||seq.charAt(j)=='6'||seq.charAt(j)=='9') {
                        cnt++;
                    }
                }
            }
        }
        System.out.print(cnt);
    }
}

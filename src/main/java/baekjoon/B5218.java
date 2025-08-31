package baekjoon;

import java.util.Scanner;

public class B5218 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        for (int i = 0; i < N; i++) {
            String a=s.next();
            String b=s.next();
            System.out.print("Distances: ");
            for (int j = 0; j < a.length(); j++) {
                char ac=a.charAt(j);
                char bc=b.charAt(j);
                int cc= ac<=bc? bc-ac : bc+26-ac;
                System.out.print(cc+" ");
            }
            System.out.println();
        }
    }
}

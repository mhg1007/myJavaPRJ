package baekjoon;

import java.util.Scanner;

public class B4470 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        for (int i = 0; i < N+1; i++) {
            String str=s.nextLine();
            if(i!=0) {
                System.out.println(i + ". " + str);
            }
        }
    }
}

package baekjoon;

import java.util.Scanner;

public class B4589 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("Gnomes:");
        for (int i = 0; i < n; i++) {
            int x=s.nextInt();
            int y=s.nextInt();
            int z=s.nextInt();
            if((x>y&&y>z)||(x<y&&y<z)){
                System.out.println("Ordered");
            }
            else{
                System.out.println("Unordered");
            }
        }
    }
}

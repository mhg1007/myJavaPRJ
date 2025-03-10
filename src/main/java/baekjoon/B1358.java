package baekjoon;

import java.util.Scanner;

public class B1358 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int W=s.nextInt();
        int H=s.nextInt();
        int X=s.nextInt();
        int Y=s.nextInt();
        int P=s.nextInt();
        int R=H/2;

        int count=0;
        for (int i = 0; i < P; i++) {
            int px=s.nextInt();
            int py=s.nextInt();

            int pyr=Y+R-py;
            if(px>=X&&px<=X+W){
                if(py>=Y&&py<=Y+H){
                    count++;
                }
            }
            else if (px<X) {
                if((X-px)*(X-px)+pyr*pyr<=R*R){
                    count++;
                }
            }
            else if (px>X+W) {
                if((px-(X+W))*(px-(X+W))+pyr*pyr<=R*R){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}

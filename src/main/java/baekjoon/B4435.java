package baekjoon;

import java.util.Scanner;

public class B4435 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] gdf={1,2,3,3,4,10};
        int[] srn={1,2,2,2,3,5,10};
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            StringBuilder sb=new StringBuilder("Battle ");
            sb.append(i+1).append(": ");

            int gs=0;
            for (int j = 0; j < 6; j++) {
                gs+=gdf[j]*s.nextInt();
            }

            int ss=0;
            for (int j = 0; j < 7; j++) {
                ss+=srn[j]*s.nextInt();
            }

            if(gs>ss){
                sb.append("Good triumphs over Evil");
            }
            else if(gs<ss){
                sb.append("Evil eradicates all trace of Good");
            }
            else{
                sb.append("No victor on this battle field");
            }

            System.out.println(sb);
        }
    }
}

package baekjoon;
import java.util.Scanner;
public class B8958 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            String ox=s.next();
            int scr=0;
            if(ox.charAt(0)=='O'){
                scr++;
            }
            int bns=0;
            for (int j = 1; j < ox.length(); j++) {
                if(ox.charAt(j-1)=='O'){
                    bns++;
                }
                if(ox.charAt(j)=='O'){
                    scr+=1+bns;
                }
                if(ox.charAt(j)=='X'){
                    bns=0;
                }
            }
            System.out.println(scr);
        }
    }
}

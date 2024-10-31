package baekjoon;
import java.util.*;
public class B5576 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int[] w=new int[10];
        for (int i = 0; i < 10; i++) {
            w[i]=s.nextInt();
        }
        Arrays.sort(w);
        int[] k=new int[10];
        for (int i = 0; i < 10; i++) {
            k[i]=s.nextInt();
        }
        Arrays.sort(k);
        int ws=w[7]+w[8]+w[9];
        int ks=k[7]+k[8]+k[9];
        System.out.print(ws+" "+ks);
    }
}

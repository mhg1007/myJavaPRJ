package baekjoon;
import java.util.*;
public class B4948 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int nr=123456;
        boolean[] a=new boolean[nr*2+1];
        Arrays.fill(a,true);
        for (int i = 2; i < Math.sqrt(nr*2)+1 ; i++) {
            if (a[i]){
                int j=2;
                while (i*j<=nr*2){
                    a[i*j]=false;
                    j++;
                }
            }
        }
        while (s.hasNextInt()){
            int n=s.nextInt();
            if(n==0){
                break;
            }
            int count=0;
            for (int i = n+1; i <=n*2 ; i++) {
                if(a[i]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

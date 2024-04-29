package baekjoon;
import java.util.*;
public class B5597 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int[] sub=new int[30];
        Arrays.fill(sub,0);
        for(int i=0; i<28; i++){
            int pass=s.nextInt();
            sub[pass-1]=1;
        }
        for(int i=0;i<30; i++){
            if(sub[i]==0){
                System.out.print(i+1+"\n");
            }
        }
    }
}

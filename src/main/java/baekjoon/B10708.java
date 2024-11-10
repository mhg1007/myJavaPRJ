package baekjoon;
import java.util.Scanner;
public class B10708 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        int[] target=new int[M];
        for (int i = 0; i < M; i++) {
            target[i]=s.nextInt();
        }
        int[] point=new int[N];
        for (int i = 0; i < M; i++) {
            int[] ans=new int[N];
            int pp=0;
            for (int j = 0; j < N; j++) {
                ans[j]=s.nextInt();
                if(ans[j]!=target[i]){
                    pp++;
                }
            }
            for (int j = 0; j < N; j++) {
                if(ans[j]==target[i]){
                    if(j+1==target[i]){
                        point[j]+=1+pp;
                    }
                    else{
                        point[j]+=1;
                    }
                }
            }
        }
        for(int a:point){
            System.out.println(a);
        }
    }
}

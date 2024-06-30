package baekjoon;
import java.util.Scanner;
public class B9063 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int[][] arr=new int[N][2];
        for (int i = 0; i < N; i++) {
            arr[i][0]=s.nextInt();
            arr[i][1]=s.nextInt();
        }
        int minx=arr[0][0];
        int maxx=arr[0][0];
        int miny=arr[0][1];
        int maxy=arr[0][1];

        for (int i = 1; i < N; i++) {
            if(arr[i][0]>maxx){
                maxx=arr[i][0];
            }
            if(arr[i][0]<minx){
                minx=arr[i][0];
            }
        }
        for (int i = 1; i < N; i++) {
            if(arr[i][1]>maxy){
                maxy=arr[i][1];
            }
            if(arr[i][1]<miny){
                miny=arr[i][1];
            }
        }
        int x=maxx-minx;
        int y=maxy-miny;

        System.out.print(x*y);
    }
}

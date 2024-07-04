package baekjoon;
import java.util.*;
public class B14215 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();

        int[] arr=new int[3];
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        Arrays.sort(arr);
        int x=arr[2];
        int y=arr[1];
        int z=arr[0];

        if(x>=(y+z)){
            x=y+z-1;
        }
        System.out.print(x+y+z);
    }
}

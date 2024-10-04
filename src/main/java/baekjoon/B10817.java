package baekjoon;
import java.util.*;
public class B10817 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr=new int[3];
        arr[0]=s.nextInt();
        arr[1]=s.nextInt();
        arr[2]=s.nextInt();
        Arrays.sort(arr);
        System.out.print(arr[1]);
    }
}

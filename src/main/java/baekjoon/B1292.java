package baekjoon;
import java.util.Scanner;
public class B1292 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr=new int[1000];
        int point=0;
        arf:
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                arr[point]=i;
                if(point==999)
                    break arf;
                point++;
            }
        }
        int A=s.nextInt();
        int B=s.nextInt();
        int sum=0;
        for (int i = A-1; i < B; i++) {
            sum+=arr[i];
        }
        System.out.print(sum);
    }
}

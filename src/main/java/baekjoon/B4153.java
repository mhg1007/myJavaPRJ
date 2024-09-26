package baekjoon;
import java.util.*;
public class B4153 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(s.hasNextInt()){
            int a=s.nextInt();
            int b=s.nextInt();
            int c=s.nextInt();
            if(a==0&&b==0&&c==0){
                break;
            }
            int[] arr={a,b,c};
            Arrays.sort(arr);
            if(arr[0]*arr[0]+arr[1]*arr[1]==arr[2]*arr[2]){
                System.out.println("right");
            }
            else{
                System.out.println("wrong");
            }
        }
    }
}

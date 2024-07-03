package baekjoon;
import java.util.*;
public class B5073 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(true) {
            int[] arr=new int[3];

            arr[0]= s.nextInt();
            arr[1]= s.nextInt();
            arr[2]= s.nextInt();
            Arrays.sort(arr);
            int a=arr[2];
            int b=arr[1];
            int c=arr[0];

            if(a<(b+c)){
                if(a==b&&b==c) {
                    System.out.println("Equilateral");
                }
                else if(a==b||b==c||a==c){
                    System.out.println("Isosceles");
                }
                else{
                    System.out.println("Scalene");
                }
            }
            else if(a==0&&b==0&&c==0){
                break;
            }
            else{
                System.out.println("Invalid");
            }
        }
    }
}

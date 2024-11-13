package baekjoon;
import java.util.Scanner;
public class B10822 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.next();
        String[] arr=str.split(",");
        int sum=0;
        for (String a : arr) {
            sum += Integer.parseInt(a);
        }
        System.out.print(sum);
    }
}

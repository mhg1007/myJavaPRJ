package baekjoon;
import java.util.Scanner;
public class B6768 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int J=s.nextInt();
        int ps=J>=4?(J-1)*(J-2)*(J-3)/6:0;
        System.out.println(ps);
    }
}

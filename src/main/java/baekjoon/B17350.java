package baekjoon;
import java.util.Scanner;
public class B17350 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        String end = "";
        for (int i = 0; i < N; i++) {
            String who=s.next();
            if(who.equals("anj")){
                end=";";
                break;
            }
            else{
                end="?";
            }
        }
        System.out.print("뭐야"+end);
    }
}

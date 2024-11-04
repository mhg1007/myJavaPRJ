package baekjoon;
import java.util.Scanner;
public class B7567 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int len=10;
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i)==str.charAt(i-1)){
                len+=5;
            }
            else{
                len+=10;
            }
        }
        System.out.print(len);
    }
}

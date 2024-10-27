package baekjoon;
import java.util.Scanner;
public class B2902 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String[] arr=str.split("-");
        for(String st:arr){
            System.out.print(st.charAt(0));
        }
    }
}

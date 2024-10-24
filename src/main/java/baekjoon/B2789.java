package baekjoon;
import java.util.Scanner;
public class B2789 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        char[] arr= {'C','A','M','B','R','I','D','G','E'};
        String str=s.next();
        String chg=str;
        for (int i = 0; i < str.length(); i++) {
            for (char c : arr) {
                if (str.charAt(i) == c) {
                    chg = chg.replace(String.valueOf(c), "");
                }
            }
        }
        System.out.print(chg);
    }
}

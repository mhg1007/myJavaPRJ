package baekjoon;
import java.util.Scanner;
public class B5586 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.next();
        int cj=0,ci=0;
        for (int i = 0; i < str.length()-2; i++) {
            if(str.charAt(i+1)=='O'&&str.charAt(i+2)=='I'){
                if (str.charAt(i)=='J'){
                    cj++;
                }
                else if(str.charAt(i)=='I'){
                    ci++;
                }
            }
        }
        System.out.print(cj+"\n"+ci);
    }
}

package baekjoon;
import java.util.Scanner;
public class B10809 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String S=s.next();
        char[] abc={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for (int i=0; i<26; i++){
            System.out.print(S.indexOf(abc[i])+" ");
        }
        s.close();
    }
}

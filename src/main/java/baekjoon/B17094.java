package baekjoon;
import java.util.Scanner;
public class B17094 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int l=s.nextInt();
        String str=s.next();
        int a=0,b=0;
        for (int i = 0; i < l; i++) {
            char c=str.charAt(i);
            if(c=='2'){
                a++;
            }
            else if (c=='e') {
                b++;
            }
        }
        if(a>b){
            System.out.println("2");
        }
        else if (a<b) {
            System.out.println("e");
        }
        else {
            System.out.println("yee");
        }
    }
}

package baekjoon;
import java.util.Scanner;
public class B1100 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int count=0;
        for (int i = 0; i < 8; i++) {
            String str=s.next();
            if(i%2==0){
                for (int j = 0; j < 8 ; j++) {
                    if(j%2==0 && str.charAt(j)=='F'){
                        count++;
                    }
                }
            }
            else{
                for (int j = 0; j < 8 ; j++) {
                    if(j%2!=0 && str.charAt(j)=='F'){
                        count++;
                    }
                }
            }
        }
        System.out.print(count);
    }
}

package programmers;
import java.util.Scanner;

public class P12918 {
    public boolean solution(String s) {
        if(s.length()==4||s.length()==6){
            for(int i=0; i<s.length(); i++){
            int scn=(int)s.charAt(i);
            if((scn>=65 && scn<=90)||(scn>=97 && scn<=122)){
                return false;
                }
            }
        }
        else{
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        System.out.print(solution(s));
    }
}

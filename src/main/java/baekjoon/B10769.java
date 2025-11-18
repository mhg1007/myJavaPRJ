package baekjoon;

import java.util.Scanner;
import java.util.regex.Pattern;

public class B10769 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String hpy=":-)";
        String sad=":-(";
        int hp=0,sp=0;
        while(str.contains(hpy)||str.contains(sad)){
            if(str.contains(hpy)){
                str=str.replaceFirst(Pattern.quote(hpy)," ");
                hp++;
            }
            else if(str.contains(sad)){
                str=str.replaceFirst(Pattern.quote(sad)," ");
                sp++;
            }
        }
        String ans;
        if(hp==0 && sp==0){
            ans="none";
        }
        else if(hp==sp){
            ans="unsure";
        }
        else if(hp>sp){
            ans="happy";
        }
        else{
            ans="sad";
        }
        System.out.print(ans);
    }
}

package baekjoon;

import java.util.Scanner;

public class B1356 {
    public static int mulStrInt(String a){
        String[] arr=a.split("");
        int answer=1;
        for(String s:arr){
            answer*=Integer.parseInt(s);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        String ns=String.valueOf(N);
        boolean chk=false;
        for (int i = 1; i < ns.length(); i++) {
            String a=ns.substring(0,i);
            String b=ns.substring(i);
            if (mulStrInt(a) == mulStrInt(b)) {
                chk = true;
                break;
            }
        }
        System.out.print(chk?"YES":"NO");
    }
}

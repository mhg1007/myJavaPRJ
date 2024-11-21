package baekjoon;

import java.util.Scanner;

public class B1259 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while (s.hasNext()){
            String str=s.next();
            if(str.equals("0"))
                break;
            String bwd="";
            for (int i = str.length()-1; i >=0; i--) {
                bwd+=str.charAt(i);
            }
            if(bwd.equals(str)){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
}

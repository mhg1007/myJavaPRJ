package baekjoon;

import java.util.Scanner;

public class B16503 {
    public static int clt(String k1, String o, String k2){
        int a=Integer.parseInt(k1);
        int b=Integer.parseInt(k2);
        int ans=0;
        switch (o){
            case "+":
                ans=a+b;
                break;
            case "-":
                ans=a-b;
                break;
            case "*":
                ans=a*b;
                break;
            case "/":
                ans=a/b;
                break;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String[] ln=s.nextLine().split(" ");
        int a=clt(String.valueOf(clt(ln[0],ln[1],ln[2])),ln[3],ln[4]);
        int b=clt(ln[0],ln[1],String.valueOf(clt(ln[2],ln[3],ln[4])));
        System.out.print(Math.min(a,b)+"\n"+Math.max(a,b));
    }
}

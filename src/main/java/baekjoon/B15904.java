package baekjoon;

import java.util.Scanner;

public class B15904 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int u=str.indexOf("U");
        int c=str.indexOf("C",u+1);
        int p=str.indexOf("P",c+1);
        int c2=str.indexOf("C",p+1);
        if(u!=-1 && c!=-1 && p!=-1 && c2!=-1){
            System.out.print("I love UCPC");
        }
        else{
            System.out.print("I hate UCPC");
        }
    }
}

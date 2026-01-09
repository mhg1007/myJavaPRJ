package baekjoon;

import java.util.Scanner;

public class B17293 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int btl=N;
        while(true){
            StringBuilder sb=new StringBuilder();
            String s1= (btl!=0? btl : "no more") +" bottle"+ (btl!=1? "s" : "");
            String s2= (btl!=0? (btl-1!=0? btl-1 : "no more") : N) +" bottle"+ (btl!=0? (btl-1!=1? "s" : "") : (N!=1? "s":""));
            String s3= btl!=0? "Take one down and pass it around, " : "Go to the store and buy some more, ";
            String s4= " of beer";
            String s5= " on the wall";
            sb.append(s1.replaceFirst("n","N")).append(s4).append(s5).append(", ").append(s1).append(s4).append(".\n");
            sb.append(s3).append(s2).append(s4).append(s5).append(".");
            if(btl!=0){
                sb.append("\n\n");
            }
            System.out.print(sb);
            if(btl==0){
                break;
            }
            btl--;
        }
    }
}

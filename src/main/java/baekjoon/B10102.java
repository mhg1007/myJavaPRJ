package baekjoon;

import java.util.Scanner;

public class B10102 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int V=s.nextInt();
        String v=s.next();
        int ac=0,bc=0;
        for (int i = 0; i < V; i++) {
            if(v.charAt(i)=='A'){
                ac++;
            }
            else if(v.charAt(i)=='B'){
                bc++;
            }
        }
        if(ac==bc){
            System.out.print("Tie");
        }
        else{
            System.out.print(ac>bc?"A":"B");
        }
    }
}

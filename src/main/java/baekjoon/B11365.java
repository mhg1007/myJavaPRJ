package baekjoon;

import java.util.Scanner;

public class B11365 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(s.hasNext()){
            String str=s.nextLine();
            if(str.equals("END")){
                break;
            }
            for (int i = str.length()-1; i>=0 ; i--) {
                System.out.print(str.charAt(i));
            }
            System.out.println();
        }
    }
}

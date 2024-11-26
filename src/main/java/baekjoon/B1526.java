package baekjoon;

import java.util.Scanner;

public class B1526 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        for (int i = N; i >=0 ; i--) {
            String str=String.valueOf(i);
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j)=='4'||str.charAt(j)=='7'){
                    count++;
                }
            }
            if(str.length()==count){
                System.out.print(i);
                break;
            }
        }
    }
}

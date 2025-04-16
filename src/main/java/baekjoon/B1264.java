package baekjoon;

import java.util.Scanner;

public class B1264 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char[] vow={'a','e','i','o','u','A','E','I','O','U'};
        while(true){
            String eng =s.nextLine();
            if(eng.equals("#")){
                break;
            }
            int el=eng.length();
            int count=0;
            for(int i=0;i<el;i++){
                for (char c : vow) {
                    if ((int) eng.charAt(i) == c) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
        s.close();
    }
}

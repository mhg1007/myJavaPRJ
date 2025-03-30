package baekjoon;

import java.util.Scanner;

public class B4949 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while (true){
            String str=s.nextLine();
            if(str.equals(".")) break;
            str=str.replaceAll("[A-Za-z.]","").replace(" ","");
            while(str.contains("()")||str.contains("[]")){
                str=str.replace("()","").replace("[]","");
            }
            System.out.println(str.isEmpty()?"yes":"no");
        }
    }
}

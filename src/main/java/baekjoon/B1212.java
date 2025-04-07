package baekjoon;

import java.util.Scanner;

public class B1212 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a=s.next();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            int b=Character.getNumericValue(a.charAt(i));
            String c=Integer.toBinaryString(b);
            while(c.length()!=3){
                c="0"+c;
            }
            sb.append(c);
        }
        String d=sb.toString();
        while(!d.isEmpty() && !d.equals("0") && d.charAt(0)=='0'){
            d=d.replaceFirst("0","");
        }
        System.out.print(d);
    }
}

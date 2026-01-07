package baekjoon;

import java.util.Scanner;

public class B15873 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String ab=s.next();
        int sum=0;
        switch (ab.length()){
            case 2:
                sum=Character.getNumericValue(ab.charAt(0))+Character.getNumericValue(ab.charAt(1));
                break;
            case 3:
                sum=ab.charAt(1)=='0'? Character.getNumericValue(ab.charAt(2))+10 : Character.getNumericValue(ab.charAt(0))+10;
                break;
            case 4:
                sum=20;
                break;
        }
        System.out.print(sum);
    }
}

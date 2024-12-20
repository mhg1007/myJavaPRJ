package baekjoon;

import java.util.Scanner;

public class B16360 {
    public static String pslt(String org){
        String lw=org.substring(org.length()-1);
        String chg=org.substring(0,org.length()-1);
        String clw="";
        switch (lw){
            case "a":
            case "o":
            case "u":
                clw="s";
                break;

            case "l":
            case "r":
            case "v":
                clw="es";
                break;

            case "t":
            case "w":
                clw="as";
                break;

            case "i":
            case "y":
                lw="i";
                clw="os";
                break;

            case "n":
                lw="an";
                clw="es";
                break;

            case "e":
                if(chg.endsWith("n")){
                    chg=chg.substring(0,chg.length()-1);
                    lw="an";
                    clw="es";
                }
                else {
                    clw="us";
                }
                break;

            default:
                clw="us";
        }
        return chg+lw+clw;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int i = 0; i < n; i++) {
            String str=s.next();
            System.out.println(pslt(str));
        }
    }
}

package baekjoon;

import java.util.List;
import java.util.Scanner;

public class B11319 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        List<Character> l=List.of('A','E','I','O','U','a','e','i','o','u');
        int S=s.nextInt();
        String fk=s.nextLine();
        for (int i = 0; i < S; i++) {
            String ln=s.nextLine();
            int cn=0,vw=0;
            for (int j = 0; j < ln.length(); j++) {
                char c=ln.charAt(j);
                if(c!=' '){
                    if(l.contains(c)){
                        vw++;
                    }
                    else{
                        cn++;
                    }
                }
            }
            System.out.println(cn+" "+vw);
        }
    }
}

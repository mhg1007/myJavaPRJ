package baekjoon;

import java.util.Scanner;

public class B1718 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String org=s.nextLine();
        String pwk=s.next();
        int pos=0;
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < org.length(); i++) {
            char pk=pwk.charAt(pos);
            char cn=org.charAt(i);
            char chg=(char)(cn-(pk-96));
            if(chg<97){
                chg+=26;
            }
            sb.append(cn!=' '?chg:' ');
            pos++;
            if(pos==pwk.length()){
                pos=0;
            }
        }
        System.out.print(sb);
    }
}

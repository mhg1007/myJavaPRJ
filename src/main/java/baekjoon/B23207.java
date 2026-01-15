package baekjoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B23207 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String[] ar1={"A#","C#","D#","F#","G#"};
        String[] ar2={"Bb","Db","Eb","Gb","Ab"};
        Map<String,String> map=new HashMap<>();
        for (int i = 0; i < ar1.length; i++) {
            map.put(ar1[i],ar2[i]);
            map.put(ar2[i],ar1[i]);
        }
        int seq=0;
        while(s.hasNextLine()){
            String prl=s.nextLine();
            if(prl.isEmpty()) break;
            seq++;
            StringBuilder sb=new StringBuilder();
            sb.append("Case ").append(seq).append(": ");
            String pre=prl.substring(0,prl.indexOf(" "));
            if(map.containsKey(pre)){
                sb.append(map.get(pre)).append(" ");
                sb.append(prl.substring(prl.indexOf(" ")+1));
            }
            else{
                sb.append("UNIQUE");
            }
            System.out.println(sb);
        }
    }
}

package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class B4732 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        List<String> list=new ArrayList<>(Arrays.asList("A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"));
        while(true){
            String ln=s.nextLine();
            if(ln.equals("***")) break;
            int mv=s.nextInt();
            String[] arr=ln.split(" ");
            StringBuilder sb=new StringBuilder();
            for (String a : arr) {
                String snd = a;
                if (snd.contains("b")) {
                    snd = list.get(list.indexOf(String.valueOf(snd.charAt(0))) - 1);
                }
                else if(!list.contains(snd) && snd.contains("#")){
                    snd = list.get(list.indexOf(String.valueOf(snd.charAt(0))) + 1);
                }
                int pos = list.indexOf(snd) + mv;
                if (pos >= list.size()) {
                    pos -= list.size();
                } else if (pos < 0) {
                    pos += list.size();
                }
                sb.append(list.get(pos)).append(" ");
            }
            System.out.println(sb);
            String fk=s.nextLine();
        }
    }
}

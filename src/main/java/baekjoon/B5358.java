package baekjoon;

import java.util.Scanner;

public class B5358 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(s.hasNextLine()) {
            String nm = s.nextLine();
            if(nm.isEmpty()) break;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < nm.length(); i++) {
                char c=nm.charAt(i);
                switch (c){
                    case 'i':
                        sb.append('e');
                        break;
                    case 'e':
                        sb.append('i');
                        break;
                    case 'I':
                        sb.append('E');
                        break;
                    case 'E':
                        sb.append('I');
                        break;
                    default:
                        sb.append(c);
                }
            }
            System.out.println(sb);
        }
    }
}

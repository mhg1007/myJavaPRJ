package baekjoon;

import java.util.Scanner;

public class B4447 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String fk = s.nextLine();
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            String hr = s.nextLine();
            sb.append(hr).append(" is ");
            hr = hr.toLowerCase();
            int g = 0, b = 0;
            for (int j = 0; j < hr.length(); j++) {
                char nm = hr.charAt(j);
                if (nm != ' ') {
                    if (nm == 'g') {
                        g++;
                    }
                    if (nm == 'b') {
                        b++;
                    }
                }
            }
            if (g > b) {
                sb.append("GOOD");
            } else if (g < b) {
                sb.append("A BADDY");
            } else {
                sb.append("NEUTRAL");
            }
            System.out.println(sb);
        }
    }
}

package baekjoon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B11723 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int M=s.nextInt();
        Set<Integer> set=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < M; i++) {
            String qr= s.next();
            switch (qr){
                case "add":
                    set.add(s.nextInt());
                    break;
                case "remove":
                    set.remove(s.nextInt());
                    break;
                case "check":
                    sb.append(set.contains(s.nextInt())?1:0).append("\n");
                    break;
                case "toggle":
                    int x=s.nextInt();
                    if(set.contains(x)){
                        set.remove(x);
                    }
                    else{
                        set.add(x);
                    }
                    break;
                case "all":
                    set.clear();
                    for (int j = 1; j <= 20; j++) {
                        set.add(j);
                    }
                    break;
                case "empty":
                    set.clear();
                    break;
            }
        }
        if(sb.length()!=0) {
            sb.setLength(sb.length() - 1);
        }
        System.out.print(sb);
    }
}

package baekjoon;

import java.util.Scanner;
import java.util.TreeMap;

public class B20291 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        TreeMap<String,Integer> trm=new TreeMap<>();
        for (int i = 0; i < N; i++) {
            String file=s.next();
            String sfx=file.substring(file.indexOf(".")+1);
            trm.put(sfx,trm.getOrDefault(sfx,0)+1);
        }
        for (String a:trm.keySet()) {
            System.out.println(a+" "+trm.get(a));
        }
    }
}

package baekjoon;

import java.util.*;

public class B17207 {
    public static int ws(int[][] a, int[][] b, int x, int y) {
        int sum=0;
        for (int i = 0; i < 5; i++) {
            sum+=a[x][i]*b[i][y];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String[] n={"Inseo", "Junsuk", "Jungwoo", "Jinwoo", "Youngki"};
        int[][] a=new int[5][5];
        int[][] b=new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j]=s.nextInt();
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                b[i][j]=s.nextInt();
            }
        }
        List<Integer> l=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int sum=0;
            for (int j = 0; j < 5; j++) {
                sum+=ws(a,b, i, j);
            }
            l.add(sum);
        }
        List<Integer> m=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            if(Objects.equals(l.get(i), Collections.min(l))){
                m.add(i);
            }
        }
        System.out.print(n[Collections.max(m)]);
    }
}

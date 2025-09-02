package baekjoon;

import java.util.Scanner;

public class B5355 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T=s.nextInt();
        String fk=s.nextLine();
        for (int i = 0; i < T; i++) {
            String line=s.nextLine();
            String[] arr=line.split(" ");
            double ans=Double.parseDouble(arr[0]);
            for (int j = 1; j < arr.length; j++) {
                String cal=arr[j];
                switch (cal){
                    case "@":
                        ans*=3;
                        break;
                    case "%":
                        ans+=5;
                        break;
                    case "#":
                        ans-=7;
                }
            }
            System.out.printf("%.2f\n",ans);
        }
    }
}

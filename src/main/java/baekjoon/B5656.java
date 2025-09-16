package baekjoon;

import java.util.Scanner;

public class B5656 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int seq=0;
        while(true){
            String[] arr=s.nextLine().split(" ");
            if(arr[1].equals("E")) break;
            seq++;
            int a=Integer.parseInt(arr[0]);
            int b=Integer.parseInt(arr[2]);
            boolean chk=false;
            switch (arr[1]){
                case ">":
                    chk=a>b;
                    break;
                case ">=":
                    chk=a>=b;
                    break;
                case "<":
                    chk=a<b;
                    break;
                case "<=":
                    chk=a<=b;
                    break;
                case "==":
                    chk=a==b;
                    break;
                case "!=":
                    chk=a!=b;
                    break;
            }
            System.out.println("Case "+seq+": "+(chk?"true":"false"));
        }
    }
}

package baekjoon;

import java.util.Scanner;

public class B5698 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(true){
            String ln=s.nextLine().toLowerCase();
            if(ln.equals("*")) break;
            String[] arr=ln.split(" ");
            boolean chk=true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i].charAt(0)!=arr[i+1].charAt(0)){
                    chk=false;
                    break;
                }
            }
            System.out.println(chk?"Y":"N");
        }
    }
}

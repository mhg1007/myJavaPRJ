package baekjoon;
import java.util.Scanner;
public class B14910 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String[] arr=str.split(" ");
        boolean chk=true;
        for (int i = 1; i < arr.length; i++) {
            int a=Integer.parseInt(arr[i]);
            int b=Integer.parseInt(arr[i-1]);
            if(a-b<0){
                chk=false;
                break;
            }
        }
        if(chk){
            System.out.print("Good");
        }
        else {
            System.out.print("Bad");
        }
    }
}

package baekjoon;
import java.util.Scanner;
public class B1032 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        String[] arr=new String[N];
        String ch="";
        for (int i = 0; i < N; i++) {
            arr[i]=s.next();
        }
        for (int i = 0; i < arr[0].length(); i++){
            int count=0;
            for (int j = 0; j < N-1; j++) {
                if(arr[j].charAt(i)==arr[j+1].charAt(i)){
                    count++;
                }
            }
            if(count==N-1){
                ch+=arr[0].charAt(i);
            }
            else{
                ch+="?";
            }
        }
        System.out.print(ch);
    }
}

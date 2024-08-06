package baekjoon;
import java.util.*;
public class B1427 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String N=s.nextLine();
        String[] arr=new String[N.length()];
        for (int i = 0; i < N.length(); i++) {
            arr[i]=String.valueOf(N.charAt(i));
        }
        Arrays.sort(arr, Collections.reverseOrder());
        String N2="";
        for (String c:arr) {
            N2+=c;
        }
        System.out.print(Integer.parseInt(N2));
    }
}

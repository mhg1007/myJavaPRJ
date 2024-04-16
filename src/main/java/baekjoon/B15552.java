package baekjoon;
import java.io.*;
public class B15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine());
        String[] s=new String[T];

        for (int i=0; i<T; i++){
            String t=br.readLine();
            String[] arr;
            arr=t.split(" ");
            int A=Integer.parseInt(arr[0]);
            int B=Integer.parseInt(arr[1]);
            s[i]= String.valueOf(A+B);
            bw.write(s[i]);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}

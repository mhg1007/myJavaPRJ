package baekjoon;

import java.io.*;

public class B10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr=new int[10000];
        int N=Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[Integer.parseInt(br.readLine())-1]+=1;
        }
        for (int i = 0; i < 10000; i++) {
            if(arr[i]!=0){
                for (int j = 0; j < arr[i]; j++) {
                    bw.write(String.valueOf(i+1));
                    bw.newLine();
                }
            }
        }
        bw.flush();
        bw.close();
    }
}

package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B10867 {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int[] arr=new int[N];
		for (int i = 0; i < N; i++) {
			arr[i]=s.nextInt();
		}
		arr=Arrays.stream(arr).distinct().toArray();
		Arrays.sort(arr);
		for (int a: arr) {
			System.out.print(a+" ");
		}
	}
}

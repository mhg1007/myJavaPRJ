package baekjoon;

import java.util.Scanner;

public class B11292 {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		while(true){
			int n=s.nextInt();
			if(n==0){
				break;
			}
			String[] name=new String[n];
			float[] hgt=new float[n];
			for (int i = 0; i < n; i++) {
				name[i]=s.next();
				hgt[i]=s.nextFloat();
			}
			float max=hgt[0];
			for (int i = 1; i < n; i++) {
				if(hgt[i]>max){
					max=hgt[i];
				}
			}
			for (int i = 0; i < n; i++) {
				if(hgt[i]==max){
					System.out.print(name[i]+" ");
				}
			}
			System.out.println();
		}
	}
}

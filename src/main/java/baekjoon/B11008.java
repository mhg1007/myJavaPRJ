package baekjoon;

import java.util.Scanner;

public class B11008 {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		for (int i = 0; i < T; i++) {
			String org=s.next();
			String cpy=s.next();
			int count=0;
			while(org.contains(cpy)){
				org=org.replaceFirst(cpy,"");
				count++;
			}
			System.out.println(count+org.length());
		}

	}
}

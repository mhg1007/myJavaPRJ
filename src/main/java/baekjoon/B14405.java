package baekjoon;

import java.util.Scanner;

public class B14405 {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String str=s.next();
		str=str.replaceAll("pi"," ");
		str=str.replaceAll("ka"," ");
		str=str.replaceAll("chu"," ");
		if(str.trim().isEmpty()){
			System.out.print("YES");
		}
		else{
			System.out.print("NO");
		}
	}
}

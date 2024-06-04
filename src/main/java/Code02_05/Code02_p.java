package Code02_05;

import java.util.Scanner;

public class Code02_p {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int num1, num2, result;

        System.out.println("첫번째 계산할 값을 입력하세요 ==> ");
        num1=s.nextInt();

        System.out.println("두번째 계산할 값을 입력하세요 ==> ");
        num2=s.nextInt();

        result=num1+num2;
        System.out.println(num1+"+"+num2+"="+result);

        result=num1-num2;
        System.out.println(num1+"-"+num2+"="+result);

        result=num1*num2;
        System.out.println(num1+"*"+num2+"="+result);

        result=num1/num2;
        System.out.println(num1+"/"+num2+"="+result);

        s.close();


    }


}

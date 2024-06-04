package Code02_05;

import java.util.Scanner;

public class Lab02_01 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String personName,personAddr;
        int weight,expost,fare;

        System.out.println("택배를 보내시려면 정보를 입력해주세요");

        System.out.print("받는사람:");
        personName=s.nextLine();
        System.out.print("주소:");
        personAddr=s.nextLine();
        System.out.print("무게(g):");
        weight=s.nextInt();

        if (personAddr.contains("경기도")||personAddr.contains("서울시"))
            expost=0;
                    else expost=3000;
        /*수도권 이외의 지역에 추가요금*/

        fare=weight*5+expost;



        System.out.println("배송정보확인");
        System.out.println("받는사람: "+personName);
        System.out.println("주소: "+personAddr);
        System.out.println("무게(g): "+weight);
        System.out.println("배송비: "+fare);


    }
}

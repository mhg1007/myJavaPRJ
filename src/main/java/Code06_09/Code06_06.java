package Code06_09;

public class Code06_06 {

    int num;    //클래스변수

    public static void main(String[] args) {
        int hap=0;
        for(int i=1;i<=10;i++){ //i는 지역변수
            //int hap=0;    for문 안에 변수를 선언하면 지역변수가 되어 실행될 때 마다 계속 초기화됨
            hap+=i;
            System.out.println("hap : "+hap);
        }
        System.out.println("1부터 10까지의 합계 : "+hap);
    }
}

package Code06_09;

public class Code07_12 {
    public static void main(String[] args) {
        Rabbit rabbit=new Rabbit();
        rabbit.setPosition(100,200);
        //rabbit.xPos=100;  에러 발생(Rabbit class 변수를 private으로 변경하면 외부접근불가)
        //rabbit.yPos=200;
    }
}

package Code06_09;

public class Code07_11 {
    public static void main(String[] args) {
        Rabbit rabbit1=new Rabbit("원");
        Rabbit rabbit2=new Rabbit("삼각형");
        Rabbit rabbit3=new Rabbit("토끼");
        String rabbitshape="사각형";
        Rabbit rabbit4=new Rabbit(rabbitshape);

        System.out.printf("토끼1 객체의 모양은 [%s]입니다.\n",rabbit1.shape);
        System.out.printf("토끼2 객체의 모양은 [%s]입니다.\n",rabbit2.shape);
        System.out.printf("토끼3 객체의 모양은 [%s]입니다.\n",rabbit3.shape);
        System.out.printf("토끼4 객체의 모양은 [%s]입니다.\n",rabbit4.shape);
    }
}

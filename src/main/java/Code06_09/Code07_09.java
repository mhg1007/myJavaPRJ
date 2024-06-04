package Code06_09;

public class Code07_09 {
    public static void main(String[] args) {
        Rabbit rabbit1=new Rabbit();
        Rabbit rabbit2=new Rabbit();
        Rabbit rabbit3=new Rabbit();

        rabbit1.shape="원";
        rabbit2.shape="삼각형";
        rabbit3.shape="토끼";

        System.out.println("rabbit1.shape : "+rabbit1.shape);
        System.out.println("rabbit2.shape : "+rabbit2.shape);
        System.out.println("rabbit3.shape : "+rabbit3.shape);

        rabbit1.setPosition(100,100);
        rabbit2.setPosition(-100,100);
        rabbit3.setPosition(0,-100);
    }
}

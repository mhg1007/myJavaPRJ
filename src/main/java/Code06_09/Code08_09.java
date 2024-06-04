package Code06_09;

interface Rabbit89{
    abstract void sleep();
}
class HouseRabbit89 implements Rabbit89{
    public void sleep(){
        System.out.println("집토끼가 우리에서 잠자고 있습니다.");
    }
}
class MountainRabbit89 implements Rabbit89{
    public void sleep(){
        System.out.println("산토끼가 굴속에서 잠자고 있습니다.");
    }
}
public class Code08_09 {
    public static void main(String[] args) {
        HouseRabbit89 hRabbit=new HouseRabbit89();
        MountainRabbit89 mRabbit=new MountainRabbit89();

        hRabbit.sleep();
        mRabbit.sleep();
    }
}

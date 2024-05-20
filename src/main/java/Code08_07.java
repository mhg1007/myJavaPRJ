abstract class Rabbit87{
    String shape;
    int xPos;
    int yPos;
    void move(int x,int y){
        this.xPos=x;
        this.yPos=y;
    }
}
class HouseRabbit87 extends Rabbit87{

}
class MountainRabbit87 extends Rabbit87{

}
public class Code08_07 {
    public static void main(String[] args) {
//      Rabbit87 rabbit=new Rabbit87(); 오류 발생
        HouseRabbit87 hRabbit=new HouseRabbit87();
        System.out.println("집토끼 객체 생성");
        MountainRabbit87 mRabbit=new MountainRabbit87();
        System.out.println("산토끼 객체 생성");
    }
}

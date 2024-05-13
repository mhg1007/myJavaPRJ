public class Rabbit2 {  //Code08
    String shape;
    int xPos;
    int yPos;
    static int count;

    Rabbit2(){
        count++;
        System.out.println("1. 슈퍼 클래스(토끼)의 생성자가 호출됩니다.");
    }
    void move(int x,int y){
        this.xPos=x;
        this.yPos=y;
    }
}
class HouseRabbit extends Rabbit2{
    String owner;
    HouseRabbit(){
        System.out.println("2. 서브 클래스(집토끼)의 생성자가 호출됩니다.");
    }
    void eatFeed(){
        System.out.println("집토끼가 사료를 먹습니다.");
    }
    @Override
    void move(int x,int y){
        super.move(x,y);
        if(this.xPos>100)
            this.xPos=100;
        if(this.yPos>100)
            this.yPos=100;
    }
}
class MountainRabbit extends Rabbit2{
    String mountain;
    void eatWildgrass(){
        System.out.println("산토끼가 풀을 먹습니다.");
    }

    @Override
    void move(int x, int y) {
        System.out.println("산토끼는 자유롭게 돌아다닙니다.");
        if(this.xPos<=500)
            this.xPos=1000;
        if(this.yPos<=500)
            this.yPos=1000;
    }
}

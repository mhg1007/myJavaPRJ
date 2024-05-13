public class Rabbit2 {  //Code08
    String shape;
    int xPos;
    int yPos;
    static int count;

    Rabbit2(){
        count++;
    }
    void move(int x,int y){
        this.xPos=x;
        this.yPos=y;
    }
}
class HouseRabbit extends Rabbit2{
    String owner;
    void eatFeed(){
        System.out.println("집토끼가 사료를 먹습니다.");
    }
}
class MountainRabbit extends Rabbit2{
    String mountain;
    void eatWildgrass(){
        System.out.println("산토끼가 풀을 먹습니다.");
    }
}

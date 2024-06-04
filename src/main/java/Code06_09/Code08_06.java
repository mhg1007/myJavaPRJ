package Code06_09;

public class Code08_06 {
    public static void main(String[] args) {
        HouseRabbit hRabbit=new HouseRabbit();
        MountainRabbit mRabbit=new MountainRabbit();

        hRabbit.move(500,500);
        mRabbit.move(500,500);

        System.out.printf("집토끼 위치 : (%d, %d) \n",hRabbit.xPos,hRabbit.yPos);
        System.out.printf("산토끼 위치 : (%d, %d) \n",mRabbit.xPos,mRabbit.yPos);
    }
}

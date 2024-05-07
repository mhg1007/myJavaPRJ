public class Rabbit {
        String shape;
        int xPos;
        int yPos;

        Rabbit(){
            shape="토끼";
        }
        void setPosition(int xPos, int yPos){
            this.xPos=xPos;
            this.yPos=yPos;

            System.out.println("xPos : "+this.xPos+" / yPos : "+this.yPos);
        }
}

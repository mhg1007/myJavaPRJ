public class Rabbit {   //Code07
        public String shape;
        public int xPos;
        public int yPos;
        Rabbit(){
            shape="토끼";
        }
        Rabbit(String shape){
            this.shape=shape;
        }
        void setPosition(int xPos, int yPos){
            this.xPos=xPos;
            this.yPos=yPos;

            System.out.println("xPos : "+this.xPos+" / yPos : "+this.yPos);
        }
}

public class DrawStarPyramid {
    public static void main(String[] args) {
        for (int i=0; i<4; i++){
            for(int j=1; j<8; j++){
                if (j>(3-i)&&j<(i+5))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

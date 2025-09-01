package baekjoon;

import java.util.Scanner;

public class B5239 {
    private static boolean solveRooks(int [] positions_x, int [] positions_y) {
        boolean isSafe = true;

        /* ------------------- INSERT CODE HERE ---------------------*/
        check:
        for(int i=0; i<positions_x.length; i++){
            int[] ipos={positions_x[i],positions_y[i]};
            for(int j=i+1; j<positions_x.length; j++){
                int[] jpos={positions_x[j],positions_y[j]};
                if(ipos[0]==jpos[0]||ipos[1]==jpos[1]){
                    isSafe=false;
                    break check;
                }
            }
        }

        /* -------------------- END OF INSERTION --------------------*/

        return isSafe;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numCases = sc.nextInt();

        for(int i = 0; i < numCases; i++)
        {
            int numRooks = sc.nextInt();

            int[] positions_x = new int[numRooks];
            int[] positions_y = new int[numRooks];

            for(int j = 0; j < numRooks; j++) {
                positions_x[j] = sc.nextInt();
                positions_y[j] = sc.nextInt();
            }

            if(solveRooks(positions_x, positions_y)) {
                System.out.println("SAFE");
            } else {
                System.out.println("NOT SAFE");
            }
        }
    }
}

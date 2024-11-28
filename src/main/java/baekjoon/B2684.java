package baekjoon;

import java.util.Scanner;

public class B2684 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int P=s.nextInt();
        for (int i = 0; i < P; i++) {
            String cs=s.next();
            int[] arr=new int[8];
            for (int j = 0; j < 38; j++) {
                char a=cs.charAt(j);
                char b=cs.charAt(j+1);
                char c=cs.charAt(j+2);
                if (a=='H'){
                    if (b=='H'){
                        if (c=='H'){
                            arr[7]++;
                        }
                        else if(c=='T'){
                            arr[6]++;
                        }
                    }
                    else if(b=='T'){
                        if (c=='H'){
                            arr[5]++;
                        }
                        else if(c=='T'){
                            arr[4]++;
                        }
                    }
                }
                else if(a=='T'){
                    if (b=='H'){
                        if (c=='H'){
                            arr[3]++;
                        }
                        else if(c=='T'){
                            arr[2]++;
                        }
                    }
                    else if(b=='T'){
                        if (c=='H'){
                            arr[1]++;
                        }
                        else if(c=='T'){
                            arr[0]++;
                        }
                    }

                }
            }
            for(int k: arr){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}

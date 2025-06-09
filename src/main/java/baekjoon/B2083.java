package baekjoon;

import java.util.Scanner;

public class B2083 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while (true){
            String name=s.next();
            int age=s.nextInt();
            int weight=s.nextInt();
            if(name.equals("#")&&age==0&&weight==0){
                break;
            }
            String club;
            if(age>17||weight>=80){
                club="Senior";
            }
            else{
                club="Junior";
            }
            System.out.println(name+" "+club);
        }
    }
}

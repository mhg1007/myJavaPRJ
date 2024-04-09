public class Code03_09 {
    public static void main(String[] args) {
        int num=20;

        System.out.println(++num);  //num 변수 출력전에 +1 돼서 21
        System.out.println(num++);  //num 변수 출력후에 +1 돼서 21
        System.out.println(num);    //22

        num++;        System.out.print(num+" ");
        num--;        System.out.print(num+" ");
        num+=3;        System.out.print(num+" ");
        num-=3;        System.out.print(num+" ");
        num*=3;        System.out.print(num+" ");
        num/=3;        System.out.print(num+" ");
        num%=3;        System.out.print(num+" ");
    }
}

public class Code11_07 {
    public static void main(String[] args) {

        int[] ary={10,20,30};

        try{
            ary[3]=1234/0;
            ary[3]=1234;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열 첨자 오류입니다. : " + e);
        }
        catch (ArithmeticException e){
            System.out.println("0으로 나누는 등의 수식 오류입니다. : " + e);
        }
        catch (Exception e){
            System.out.println("자바 에러 최고 조상 "+e);   //Exeption은 범위가 가장 크므로 맨 밑에 넣는다
        }
        finally {   //안써도 되지만 메모리 누수 방지를 위해 사용하는 것이 좋다
            System.out.println("이 부분은 무조건 보여요.");
        }
    }
}

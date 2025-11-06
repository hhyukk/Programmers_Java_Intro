package 예외처리;

public class ExceptionExam3 {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        try {
            int k = divide(i, j);
            System.out.println(k);
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
        }
    }

    public static int divide(int i, int j) throws IllegalArgumentException {
        if (j == 0) {
//            if로 예외처리를 했는데 함수가 int 리턴값을 가져야해서 이상한 값을 리턴해야 하는 경우가 생김
//            System.out.println("2번째 매개변수는 0이면 안됩니다.");
//            return 0;
            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
        }
        int k = i / j;
        return k;
    }
}

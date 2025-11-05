package 상속;

public class AccessObjExam {
    public static void main(String[] args) {
        AccessObj obj = new AccessObj();
        System.out.println(obj.p);
        System.out.println(obj.p2);
        System.out.println(obj.k);

//        i는 private이기 때문에 접근 불가
//        System.out.println(obj.i);
    }
}

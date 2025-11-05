package 상속;

public class Truck extends Car2 {
    public Truck() {
//        부모의 생성자를 내가 호출하지 않으면 컴파일러는 기본 생성자만 호출하는데
//        부모클래스는 기본 생성자가 없기 때문에 부모 클래스의 생성자를 직접 호출해야함
        super("소방차");
        System.out.println("Truck의 기본 생성자 입니다.");
    }
}

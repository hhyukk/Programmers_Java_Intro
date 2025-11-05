package 상속;

public class BusExam {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.run();
        bus.ppangppang();

        Car car = new Car();
        car.run();

//        부모클래스는 자식 클래스의 메소드를 사용할 수 없음
//        car.ppangppang();
    }
}

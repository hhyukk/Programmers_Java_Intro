package 상속;

public class DuckExam {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.sing();
        duck.fly();

//        추상클래스는 부모로써의 역할은 가능하지만 추상클래스 자체를 이용해서 객체를 생성할수는 없다.
//        Bird b = new BIrd();
    }
}

package 상속;

public class BusExam {
    public static void main(String[] args) {
        Car c = new Bus();
        c.run();

        Bus bus = (Bus) c;
        bus.run();
        bus.ppangppang();
    }
}

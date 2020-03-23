package Lesson6;

public class TestCar {
    public static void main(String[] args) {
        Car c1 = new Car(52123, 62, 783, 65);
        System.out.println("Move: " + c1.move());
        System.out.println("Park: " + c1.park1() + c1.park2());
        System.out.println("Accelerate: " + c1.accelerate());

        Car c2 = new Car(52123, 62, 783);
        System.out.println("Move: " + c2.move());
        System.out.println("Park: " + c2.park1() + c2.park2());
        System.out.println("Accelerate: " + c2.accelerate());

        Car c3 = new Car(52123, 62);
        System.out.println("Move: " + c3.move());
        System.out.println("Park: " + c3.park1() + c3.park2());
        System.out.println("Accelerate: " + c3.accelerate());

        Car c4 = new Car(52123);
        System.out.println("Move: " + c4.move());
        System.out.println("Park: " + c4.park1() + c4.park2());
        System.out.println("Accelerate: " + c4.accelerate());

        Car c5 = new Car();
        System.out.println("Move: " + c5.move());
        System.out.println("Park: " + c5.park1() + c5.park2());
        System.out.println("Accelerate: " + c5.accelerate());
    }
}

package KIET_OOPS.Polymorphism;

public class MyCalc {
    public static void main(String[] args) {
        Calculator cl = new Calculator();

        cl.Area(12.3, 4.5);
        cl.Area(10);
        cl.Area(10, 20, 30);
    }
}

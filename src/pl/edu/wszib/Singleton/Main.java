package pl.edu.wszib.Singleton;

public class Main {
    public static void main(String[] args) {
        CarSingleton car1 = CarSingleton.getInstance();
        CarSingleton car2 = CarSingleton.getInstance();

        System.out.println("car1 power before: " + car1.getPower());
        System.out.println("car2 power before: " + car2.getPower());

        car1.addMorePower(100);
        car2.addMorePower(10);
        car1.reducePower();


        System.out.println("car1 power after: " + car1.getPower());
        System.out.println("car2 power after: " + car2.getPower());
    }
}

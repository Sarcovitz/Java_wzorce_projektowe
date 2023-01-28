package pl.edu.wszib.Singleton;

public class CarSingleton {
    private static volatile CarSingleton instance = null;
    private int power = 100;

    private CarSingleton() {}

    public static CarSingleton getInstance()
    {
        if (instance == null)
        {
            synchronized(CarSingleton.class)
            {
                if (instance == null) instance = new CarSingleton();
            }
        }

        return instance;
    }

    public int getPower() {
        return power;
    }

    public void addMorePower(int power) {
        this.power += power;
    }

    public void reducePower() {
        power--;
    }

}

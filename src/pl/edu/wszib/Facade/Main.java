package pl.edu.wszib.Facade;

import pl.edu.wszib.Singleton.CarSingleton;

public class Main {
    public static void main(String[] args) {
        DriftingFacade facade = new DriftingFacade();
        facade.Drift();
    }
}

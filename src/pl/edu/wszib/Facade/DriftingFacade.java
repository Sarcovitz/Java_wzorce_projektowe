package pl.edu.wszib.Facade;

public class DriftingFacade {
    private Car car = new Car();
    private Driver driver = new Driver();

    public DriftingFacade() {
    }

    public void Drift()
    {
        driver.StealCar();
        driver.GetIntoCar();
        car.StartCar();
        car.Accelerate();
        driver.TurnLeft();
        car.UseMaximalPower();
        driver.TurnRight();
        car.StopCar();
    }
}

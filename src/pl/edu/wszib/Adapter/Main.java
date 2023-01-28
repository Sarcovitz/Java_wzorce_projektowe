package pl.edu.wszib.Adapter;

public class Main {
    public static void main(String[] args) {
        FuelDistributor fuelDistributor = new FuelDistributor();

        fuelDistributor.refill("gas",50);
        fuelDistributor.refill("diesel",20);
        fuelDistributor.refill("petrol", 30);
        fuelDistributor.refill("rocket fuel", 1000);
    }
}

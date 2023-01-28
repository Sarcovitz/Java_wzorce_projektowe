package pl.edu.wszib.Adapter;

public class FuelAdapter implements PetrolStation
{
    BetterPetrolStation betterPetrolStation;

    public FuelAdapter(String fuelType)
    {
        if(fuelType.equalsIgnoreCase("diesel")) betterPetrolStation = new DieselDistributor();
        else if (fuelType.equalsIgnoreCase("gas")) betterPetrolStation = new GasDistributor();
    }

    @Override
    public void refill(String fuelType, int litres)
    {
        if(fuelType.equalsIgnoreCase("diesel")) betterPetrolStation.refillDiesel(litres);
        else if(fuelType.equalsIgnoreCase("gas")) betterPetrolStation.refillGas(litres);
    }
}

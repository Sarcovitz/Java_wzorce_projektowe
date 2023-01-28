package pl.edu.wszib.Adapter;

public class FuelDistributor implements PetrolStation
{
    FuelAdapter adapter;

    @Override
    public void refill(String fuelType, int litres)
    {
        if(fuelType.equalsIgnoreCase("petrol")) System.out.println("Refilling " + litres + " of Petrol");
        else if (fuelType.equalsIgnoreCase("diesel") || fuelType.equalsIgnoreCase("gas"))
        {
            adapter = new FuelAdapter(fuelType);
            adapter.refill(fuelType, litres);
        }
        else System.out.println("Unknown fuel type!");
    }
}

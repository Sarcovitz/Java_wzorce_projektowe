package pl.edu.wszib.Adapter;

public class DieselDistributor implements BetterPetrolStation
{
    @Override
    public void refillDiesel(int litres)
    {
        System.out.println("Refilling " + litres + " of Diesel");
    }

    @Override
    public void refillGas(int litres) { }
}

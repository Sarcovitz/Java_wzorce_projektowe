package pl.edu.wszib.Adapter;

public class GasDistributor implements BetterPetrolStation
{
    @Override
    public void refillDiesel(int litres) { }

    @Override
    public void refillGas(int litres)
    {
        System.out.println("Refilling " + litres + " of Gas");
    }
}

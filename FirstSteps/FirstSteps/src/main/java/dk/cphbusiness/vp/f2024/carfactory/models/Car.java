package dk.cphbusiness.vp.f2024.carfactory.models;

public class Car
{
    private static int serialNumber;

    static
    {
        serialNumber = 1000;
    }



    public void setSerialNumber(int newNum)
    {
        serialNumber = newNum;
    }

    public int getSerialNumber()
    {
        return serialNumber;
    }
    public void carProduced()
    {
        serialNumber++;
    }






}

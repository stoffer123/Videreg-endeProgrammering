package dk.cphbusiness.vp.f2024.cars.models;
import java.util.ArrayList;
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

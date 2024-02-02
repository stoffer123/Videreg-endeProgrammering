package dk.cphbusiness.vp.f2024.carfactory.factory.models;


public class Bmw extends Car
{
    private int carSerial;
    private String name;
    private int horsePower;
    private int maxSpeed;
    private boolean isOn;



    public Bmw()
    {
        this.carSerial = getSerialNumber();
        this.horsePower = 500;
        this.maxSpeed = 250;
        this. isOn = false;
        this.name = "BMW " + carSerial;
        carProduced();

    }

    public String getName()
    {
        return name;
    }

    public int getCarSerial()
    {
        return carSerial;
    }



}

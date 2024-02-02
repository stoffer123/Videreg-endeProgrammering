package dk.cphbusiness.vp.f2024.carfactory.factory.models;


public class Vw extends Car
{
    private int carSerial;
    private String name;
    private int horsePower;
    private int maxSpeed;
    private boolean isOn;



    public Vw()
    {
        this.carSerial = getSerialNumber();
        this.horsePower = 250;
        this.maxSpeed = 200;
        this. isOn = false;
        this.name = "VW " + carSerial;
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

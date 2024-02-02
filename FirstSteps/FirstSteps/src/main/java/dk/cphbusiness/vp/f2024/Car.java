package dk.cphbusiness.vp.f2024;

public class Car
{
    //Class variables
    private static int carNumber;
    private static String[] models = {"Volkswagen", "Skoda", "Peugeot"};
    private static String[] colors = {"Red", "Blue", "Green"};
    //Object variables
    private String name;
    private int horsepower;
    private boolean isOn;
    private String color;
    private String model;

    static
    {
        carNumber = 1000;
    }

    public Car(model)
    {
        this.name = model + "SerialNr: " + carNumber++;
    }

    public void setHorsepower(int hp)
    {
        this.horsepower = hp;
    };

    public void turnOn()
    {
        if(isOn)
        {
            System.out.println("Car is already on");
            return;
        }
        isOn = true;
        System.out.println("Car was turned ON!");
    }

    public void turnOff()
    {
        if(!isOn)
        {
            System.out.println("Car is already turned off");
        }
        isOn = false;
        System.out.println("Car was turned OFF!");
    }





}


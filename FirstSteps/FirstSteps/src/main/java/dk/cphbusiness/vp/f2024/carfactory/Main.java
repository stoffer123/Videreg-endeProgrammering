package dk.cphbusiness.vp.f2024.carfactory;

import dk.cphbusiness.vp.f2024.carfactory.factory.Factory;

public class Main
{
    public static void main(String[] args)
    {
        Factory factory = new Factory();

        factory.produceCar(5, "BMW");

        factory.printAllCars();



    }
}

package dk.cphbusiness.vp.f2024.cars;

import dk.cphbusiness.vp.f2024.cars.models.Bmw;
import dk.cphbusiness.vp.f2024.cars.factory.Factory;

public class Main
{
    public static void main(String[] args)
    {
        Factory factory = new Factory();

        factory.produceCar(5, "BMW");

        factory.printAllCars();


    }
}

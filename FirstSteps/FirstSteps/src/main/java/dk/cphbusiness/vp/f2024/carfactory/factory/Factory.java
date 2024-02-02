package dk.cphbusiness.vp.f2024.carfactory.factory;
import dk.cphbusiness.vp.f2024.carfactory.factory.models.Bmw;
import dk.cphbusiness.vp.f2024.carfactory.factory.models.Car;

import java.util.ArrayList;
public class Factory
{
    private static ArrayList<Car> cars = new ArrayList<Car>();

    public Factory()
    {

    }

    public void produceCar(int amount, String type)
    {
        String carToBuild = type.toLowerCase();
        System.out.println(carToBuild);

        for(int i = 0; i < amount; i++)
        {
            if(carToBuild.equals("bmw"))
            {
                cars.add(new Bmw());
            }
            else
            {
                System.out.println(carToBuild + " was not found in available models to build");
                break;
            }

        }
    }

    public void printAllCars()
    {
        for(Car car : cars)
        {
            if(car instanceof Bmw)
            {
                System.out.println(((Bmw) car).getName());
            }
        }
    }

}

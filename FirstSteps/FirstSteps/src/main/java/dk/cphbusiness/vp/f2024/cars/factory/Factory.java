package dk.cphbusiness.vp.f2024.cars.factory;
import dk.cphbusiness.vp.f2024.cars.models.Bmw;
import dk.cphbusiness.vp.f2024.cars.models.Car;

import java.util.ArrayList;
public class Factory
{
    private static ArrayList<Car> cars = new ArrayList<Car>();

    public Factory()
    {

    }

    public void produceCar(int orderNumber, String type)
    {
        for(int i = 0; i < orderNumber; i++)
        {
            if(type == "BMW")
            {
                cars.add(new Bmw());
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

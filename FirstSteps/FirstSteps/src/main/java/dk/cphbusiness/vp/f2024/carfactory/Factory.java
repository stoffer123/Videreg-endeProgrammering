package dk.cphbusiness.vp.f2024.carfactory;
import dk.cphbusiness.vp.f2024.carfactory.models.Bmw;
import dk.cphbusiness.vp.f2024.carfactory.models.Car;
import dk.cphbusiness.vp.f2024.carfactory.models.Vw;
import java.util.Scanner;


import java.util.ArrayList;
public class Factory
{
    private static ArrayList<Car> cars = new ArrayList<Car>();

    public Factory() {

    }

    public void mainMenu() {
        while(true) {
            System.out.println("Select an option:");
            System.out.println("""
                    [1]Build cars
                    [2]Print list of cars
                    [3]Exit
                    """
            );

            switch (readIntInput()) {
                case 1:
                    System.out.println("Build cars selected");
                    buildMenu();
                    break;
                case 2:
                    System.out.println("Print list of cars selected");
                    printMenu();
                    break;
                case 3:
                    System.out.println("Shutting down program");
                    System.exit(0);
                    break;


                case 1111:
                    System.out.println("Not a valid option, try again.");
                    break;
                default:
                    System.out.println("Not a valid option, try again.");
                    break;
            }
        }
    }

    //Menu for building cars
    private void buildMenu()
    {
        int carToBuild;
        int amount;
        System.out.println("""
                Select wanted car: 
                [1] VW
                [2] BMW
                [0] Exit to main menu
                """);
        carToBuild = readIntInput();

        System.out.println("How many do you want?");
        amount = readIntInput();

        switch (carToBuild){
            case 1:
                buildCars("VW", amount);
                break;
            case 2:
                buildCars("BMW", amount);
                break;
            default:
                System.out.println("Not a valid model, try again.");
                break;
        }

    }

    //Build car function
    private void buildCars(String type, int amount)
    {
        String carToBuild = type.toLowerCase();

        for(int i = 0; i < amount; i++)
        {
            if(carToBuild.equals("bmw"))
            {
                cars.add(new Bmw());

            }
            else if(carToBuild.equals("vw"))
            {
                cars.add(new Vw());

            }

        }
    }

    //Main menu
    private void printMenu()
    {
        System.out.println("""
                [1]Print all cars
                [2]Print all VW
                [3]Print all BMW
                """);

        switch(readIntInput()) {
            case 1:
                printCars(1);
                break;
            case 2:
                printCars(2);
                break;
            case 3:
                printCars(3);
                break;
            default:
                System.out.println("Not a valid option try again;");
                break;
        }
    }
//Print cars
    private void printCars(int selection) {
        if (selection == 1) {
            for (Car car : cars) {
                if (car instanceof Bmw) {
                    System.out.println(((Bmw) car).getName());
                }
                if (car instanceof Vw) {
                    System.out.println(((Vw) car).getName());
                }
            }
        } else if (selection == 2) {
            for (Car car : cars) {
                if (car instanceof Vw) {
                    System.out.println(((Vw) car).getName());
                }

            }
        }else if(selection == 3){
            for(Car car : cars){
                if(car instanceof Bmw) {
                    System.out.println(((Bmw) car).getName());
                }
            }
        }
    }
//Read input and make sure it is an int. If it is not an int, return 1111.
    private int readIntInput()
    {
        Scanner scanner = new Scanner(System.in);
        int input = 1111;

        try{
            input = Integer.parseInt(scanner.nextLine());
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }

        return input;

    }


}



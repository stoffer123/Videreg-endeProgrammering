package dk.cphbusiness.vp.f2024;

import dk.cphbusiness.vp.f2024.carfactory.Factory;
import dk.cphbusiness.vp.f2024.tictactoe.Game;
import dk.cphbusiness.vp.f2024.tictactoe.GameImpl;

public class Main
{
    public static void main(String[] args)
    {
 /*
        //test carFactory

         Factory factory = new Factory();
         factory.mainMenu();
*/

        Game game = new GameImpl();
        game.runGame();

    }


}

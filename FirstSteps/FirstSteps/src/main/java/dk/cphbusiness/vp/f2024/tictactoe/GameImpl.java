package dk.cphbusiness.vp.f2024.tictactoe;

public class GameImpl implements Game
{
    private int playerTurn = 1;
    private int[] move;
    @Override
    public void updateScore(Player player)
    {

    }

    @Override
    public void runGame()
    {
        Player player1 = new PlayerImpl("Lars", 'X');
        Player player2 = new PlayerImpl("Kim", 'O');
        Board board = new BoardImpl();

        board.printBoard();

        if(playerTurn == 1)
        {
            board.makeMove(player1, move);
            playerTurn = 2;
        }else if(playerTurn == 2)
        {
            board.makeMove(player2, move);
            playerTurn = 1;
        }

    }
}

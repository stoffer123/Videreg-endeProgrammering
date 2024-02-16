package dk.cphbusiness.vp.f2024.tictactoe;

public class BoardImpl implements Board
{
    private char board[][] = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '},
    };
    @Override
    public void printBoard()
    {
        System.out.println("+---+---+---+");
        System.out.println("| " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " |");
        System.out.println("+---+---+---+");
        System.out.println("| " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " |");
        System.out.println("+---+---+---+");
        System.out.println("| " + board[2][0] + " | " + board[2][1] + " | " + board[1][2] + " |");
        System.out.println("+---+---+---+");
    }

    @Override
    public void checkWinner(Player player1, Player player2)
    {
        Player players[] = {player1, player2};
        for(Player player : players)
        {
            if(
                //Check horizontal
                    board[0][0] == player.getSymbol() && board[0][1] == player.getSymbol() && board[0][2] == player.getSymbol()
                    || board[1][0] == player.getSymbol() && board[1][1] == player.getSymbol() && board[1][2] == player.getSymbol()
                    || board[2][0] == player.getSymbol() && board[2][1] == player.getSymbol() && board[2][2] == player.getSymbol()
                //Check vertical
                    || board[0][0] == player.getSymbol() && board[1][0] == player.getSymbol() && board[2][0] == player.getSymbol()
                    || board[0][1] == player.getSymbol() && board[1][1] == player.getSymbol() && board[2][1] == player.getSymbol()
                    || board[0][2] == player.getSymbol() && board[1][2] == player.getSymbol() && board[2][2] == player.getSymbol()
                //Check diagonal
                    || board[0][0] == player.getSymbol() && board[1][1] == player.getSymbol() && board[2][2] == player.getSymbol()
                    || board[0][2] == player.getSymbol() && board[1][1] == player.getSymbol() && board[2][0] == player.getSymbol()
            )
            {
                //Apply score
                System.out.println(player.getName() + "Has won!");
                player.incrScore();
                return;

            }


        }
    }

    @Override
    public void scoreBoard(Player player1, Player player2)
    {

        System.out.println(player1.getName() + ": " + player1.getScore());
        System.out.println(player2.getName() + ": " + player2.getScore());
    }

    @Override
    public void changeBoard(char[][] board)
    {

    }
}

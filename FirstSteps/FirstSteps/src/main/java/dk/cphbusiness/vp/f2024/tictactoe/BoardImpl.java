package dk.cphbusiness.vp.f2024.tictactoe;

public class BoardImpl implements Board
{
    private char[][] board;

BoardImpl()
{
    this.board = new char[3][3];
    intialize();
}

    @Override
    public void intialize()
    {
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                board[i][j] = ' ';
            }
        }

    }

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
    public boolean checkWinner(Player player)
    {
        //Check horizontal
        return board[0][0] == player.getSymbol() && board[0][1] == player.getSymbol() && board[0][2] == player.getSymbol()
                || board[1][0] == player.getSymbol() && board[1][1] == player.getSymbol() && board[1][2] == player.getSymbol()
                || board[2][0] == player.getSymbol() && board[2][1] == player.getSymbol() && board[2][2] == player.getSymbol()
                //Check vertical
                || board[0][0] == player.getSymbol() && board[1][0] == player.getSymbol() && board[2][0] == player.getSymbol()
                || board[0][1] == player.getSymbol() && board[1][1] == player.getSymbol() && board[2][1] == player.getSymbol()
                || board[0][2] == player.getSymbol() && board[1][2] == player.getSymbol() && board[2][2] == player.getSymbol()
                //Check diagonal
                || board[0][0] == player.getSymbol() && board[1][1] == player.getSymbol() && board[2][2] == player.getSymbol()
                || board[0][2] == player.getSymbol() && board[1][1] == player.getSymbol() && board[2][0] == player.getSymbol();
    }

    @Override
    public void scoreBoard(Player player1, Player player2)
    {

        System.out.println(player1.getName() + ": " + player1.getScore());
        System.out.println(player2.getName() + ": " + player2.getScore());
    }

    @Override
    public boolean makeMove(Player player, int[] move)
    {
        int row = move[0];
        int col = move[1];

        if(row < 0 || row >= 3 || col < 0 || col >= 3 ||board[row][col] != ' ')
        {
            return false; //invalid move
        }
        board[row][col] = player.getSymbol();
        return true;
    }
}

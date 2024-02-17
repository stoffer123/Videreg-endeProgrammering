package dk.cphbusiness.vp.f2024.tictactoe;

public interface Board
{
    void intialize();
    void printBoard();
    boolean checkWinner(Player player);
    void scoreBoard(Player player1, Player player2);
    boolean makeMove(Player player, int[] move);


}

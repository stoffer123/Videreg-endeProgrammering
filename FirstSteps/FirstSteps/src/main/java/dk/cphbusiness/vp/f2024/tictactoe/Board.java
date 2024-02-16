package dk.cphbusiness.vp.f2024.tictactoe;

public interface Board
{
    void printBoard();
    void checkWinner(Player player1, Player player2);
    void scoreBoard();

    void changeBoard(char[][] board);


}

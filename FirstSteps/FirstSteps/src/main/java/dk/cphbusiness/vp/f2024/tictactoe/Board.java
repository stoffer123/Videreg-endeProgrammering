package dk.cphbusiness.vp.f2024.tictactoe;

public interface Board
{
    void initialize();
    void makeMove(Player player);
    void checkWinner(Player player);
}

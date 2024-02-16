package dk.cphbusiness.vp.f2024.tictactoe;

public interface Game
{
    void updateScore(Player player);
    void resetGame();
    void makeMove(Player player);

}

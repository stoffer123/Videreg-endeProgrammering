package dk.cphbusiness.vp.f2024.tictactoe;

public interface Player
{
    void setSymbol(char newSymbol);
    char getSymbol();
    String getName();
    int getScore();
    void incrScore();


}

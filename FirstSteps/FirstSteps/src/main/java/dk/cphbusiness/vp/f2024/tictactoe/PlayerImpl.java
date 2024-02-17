package dk.cphbusiness.vp.f2024.tictactoe;

public class PlayerImpl implements Player
{
    private char symbol;
    private String name;
    private int score;

    public PlayerImpl(String name, char symbol)
    {
        this.name = name;
        this.symbol = symbol;
    }

    @Override
    public void setSymbol(char newSymbol)
    {
        this.symbol = newSymbol;
    }

    @Override
    public char getSymbol()
    {
        return this.symbol;
    }

    @Override
    public String getName()
    {
        return this.name;
    }

    @Override
    public int getScore()
    {
        return this.score;
    }

    @Override
    public void incrScore()
    {
        this.score++;
        System.out.println(this.name + "Score increased by 1");
    }
}

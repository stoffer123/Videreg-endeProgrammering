package dk.cphbusiness.vp.f2024.textio;

public interface TextIO
{
    void put();
    void clear();
    String get();


    int getInt();
    int getInt(int min, int max);

}

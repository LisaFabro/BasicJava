package Es_4;

public abstract class Forma{
    private int base = 10;
    private int altezza = 5;

    public int getBase(){

        return base;
    }
    public int getAltezza(){

        return altezza;
    }
    public abstract void calcolaArea();
}

package Es_2;

public class Rettangolo extends Forma{
    public int base = 10;
    public int altezza = 5;

    @Override
    public void calcolaArea() {
        System.out.println("Area del Rettangolo: " + base*altezza);
    }
}

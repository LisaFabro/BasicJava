package Es_2;

public class Rettangolo2 extends Forma2 {
    public int base = 10;
    public int altezza = 5;

    @Override
    public int calcolaArea() {
        return base*altezza;
    }
}

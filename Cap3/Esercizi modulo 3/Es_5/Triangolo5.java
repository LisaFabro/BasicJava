package Es_5;

public class Triangolo5 implements Forma5 {
    public int base = 5;
    public int altezza = 2;
    @Override
    public int calcolaArea() {
        return base*altezza/2;
    }
}

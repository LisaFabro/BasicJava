package Es_5;

public class Triangolo5 implements Forma5 {
    public int base;
    public int altezza;

    public Triangolo5(int base, int altezza){
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    public int calcolaArea() {
        return base*altezza/2;
    }
}

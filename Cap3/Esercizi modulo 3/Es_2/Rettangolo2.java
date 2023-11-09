package Es_2;

public class Rettangolo2 extends Forma2 {
    public Rettangolo2(int base, int altezza){
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public int calcolaArea() {
        return base*altezza;
    }
}

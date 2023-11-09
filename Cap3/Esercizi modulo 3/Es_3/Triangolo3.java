package Es_3;

public class Triangolo3 extends Forma3 {
    public Triangolo3(int base, int altezza){
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    public int calcolaArea() {
        return (base*altezza)/2;
    }
}

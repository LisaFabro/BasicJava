package Es_3;


public class Rettangolo3 extends Forma3 {

    public Rettangolo3(int base, int altezza){
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public int calcolaArea() {
        return base*altezza;    }
}
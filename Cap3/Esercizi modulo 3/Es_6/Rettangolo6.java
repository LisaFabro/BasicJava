package Es_6;

public class Rettangolo6 extends Forma6{

    public Rettangolo6(int base, int altezza){
        this.base=base;
        this.altezza=altezza;
        this.tipo=tipoForma.Rettangolo;
    }

    @Override
    public int calcolaArea() {
        return base*altezza;
    }
}

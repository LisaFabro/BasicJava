package Es_6;

public class Triangolo6 extends Forma6{

    public Triangolo6(int base, int altezza){
        this.base=base;
        this.altezza=altezza;
        this.tipo=tipoForma.Triangolo;
    }
    @Override
    public int calcolaArea() {
        return (base*altezza)/2;
    }
}

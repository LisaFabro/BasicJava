package Es_6;

public class Rettangolo6 extends Forma6{
    TIPOFORMA  formaRettangolo = TIPOFORMA.Rettangolo;

    public Rettangolo6(int base, int altezza){
        this.base=base;
        this.altezza=altezza;
    }

    @Override
    public int calcolaArea() {
        return base*altezza;
    }
}

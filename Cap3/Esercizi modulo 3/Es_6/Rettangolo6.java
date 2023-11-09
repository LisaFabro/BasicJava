package Es_6;

public class Rettangolo6 extends Forma6{
    tipoForma  formaRettangolo = tipoForma.rettangolo;
    int base = 3;
    int altezza = 5;

    @Override
    public int calcolaArea() {
        return base*altezza;
    }
}

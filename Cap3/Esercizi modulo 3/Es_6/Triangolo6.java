package Es_6;

public class Triangolo6 extends Forma6{
    tipoForma  formaTriangolo = tipoForma.triangolo;
    int base = 4;
    int altezza = 5;
    @Override
    public int calcolaArea() {
        return (base*altezza)/2;
    }
}

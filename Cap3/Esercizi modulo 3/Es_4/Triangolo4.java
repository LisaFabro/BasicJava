package Es_4;

public class Triangolo4 extends Forma4 {
    public Triangolo4(int base, int altezza){
        this.altezza = altezza;
        this.base = base;
    }
    //funziona anche senza Override. Solo per cl. figlie di cl. abstract?
    @Override
    public int calcolaArea(){

        return (base*altezza) / 2;
    }
}

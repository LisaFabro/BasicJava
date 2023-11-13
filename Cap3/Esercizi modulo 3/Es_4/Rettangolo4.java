package Es_4;


public class Rettangolo4 extends Forma4 {
    public Rettangolo4(int base, int altezza){
        this.altezza = altezza;
        this.base = base;
    }
    //funziona anche senza Override. Solo per cl. figlie di cl. abstract?
    @Override
    public int calcolaArea(){

        return base*altezza;
    }

}

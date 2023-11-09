package Es_4;

public class Triangolo4 extends Forma4 {
    public Triangolo4(int base, int altezza){
        this.altezza = altezza;
        this.base = base;
    }
    public int calcolaArea(){

        return (base*altezza) / 2;
    }
}

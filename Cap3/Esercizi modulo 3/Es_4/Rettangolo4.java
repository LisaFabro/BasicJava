package Es_4;


public class Rettangolo4 extends Forma4 {
    public Rettangolo4(int base, int altezza){
        this.altezza = altezza;
        this.base = base;
    }
    public int calcolaArea(){

        return base*altezza;
    }

}

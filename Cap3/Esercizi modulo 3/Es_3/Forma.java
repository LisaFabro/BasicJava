package Es_3;

public class Forma {
    private int base = 10;
    private int altezza = 5;

    public int getBase(){
        return base;
    }
    public int getAltezza(){
        return altezza;
    }
    public void calcolaArea(){

        System.out.println("I valori inseriti  per il calcolo delle aree sono: base " + getBase() + " e altezza " + getAltezza());
    }
}

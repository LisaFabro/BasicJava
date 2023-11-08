package Es_3;

public class Rettangolo extends Forma {

    @Override
    public void calcolaArea() {

        System.out.println("Area del Rettangolo: " + getBase()*getAltezza());
    }
}
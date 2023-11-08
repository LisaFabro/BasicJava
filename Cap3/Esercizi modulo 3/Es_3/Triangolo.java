package Es_3;

public class Triangolo extends Forma{
    @Override
    public void calcolaArea() {

        System.out.println("Area del Triangolo: " + (getBase()*getAltezza())/2);
    }
}

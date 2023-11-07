package Es_1;

import Es_1.Animale;

public class Gatto extends Animale {
    public String versoGatto = " Il gatto miagola";
    @Override
    public void faiIlVerso() {
        System.out.println(versoGatto);
    }
}

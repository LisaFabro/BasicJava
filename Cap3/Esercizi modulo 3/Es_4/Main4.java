package Es_4;

public class Main4 {
    //Scrivere un programma che contenga una classe astratta chiamata Forma ed un metodo astratto chiamato calcolaArea().
    //Crea poi due sottoclassi Rettangolo e Triangolo che estendono Forma ed implementano il metodo per il calcolo
    // dell'area in maniera specifica.
    public static void main(String[] args) {
        Rettangolo4 rettangolo = new Rettangolo4();
        Triangolo4 triangolo = new Triangolo4();

        System.out.println("Area del Rettangolo: " + rettangolo.calcolaArea());
        System.out.println("Area del Triangolo: " + triangolo.calcolaArea());
    }
}

package Es_4;

public class Main {
    //Scrivere un programma che contenga una classe astratta chiamata Forma ed un metodo astratto chiamato calcolaArea().
    //Crea poi due sottoclassi Rettangolo e Triangolo che estendono Forma ed implementano il metodo per il calcolo
    // dell'area in maniera specifica.
    public static void main(String[] args) {
            Rettangolo rettangolo = new Rettangolo();
            Triangolo triangolo = new Triangolo();

            rettangolo.calcolaArea();
            triangolo.calcolaArea();
    }
}

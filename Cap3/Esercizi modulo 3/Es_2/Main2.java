package Es_2;

public class Main2 {
    //Scrivere un programma che contenga una classe chiamata Forma ed un metodo chiamato calcolaArea()
    // che stampi l'area della forma. Crea poi una sottoclasse chiamata Rettangolo che fa override
    // del metodo calcolaArea() per calcolare l'area del rettangolo.
    public static void main(String[] args){
        Forma2 forma = new Forma2();
        Rettangolo2 rettangolo = new Rettangolo2();

        System.out.println("Numero massimo lati ammessi per le forme " + forma.calcolaArea());
        System.out.println("L'area del rettangolo è: " + rettangolo.calcolaArea());
    }
}

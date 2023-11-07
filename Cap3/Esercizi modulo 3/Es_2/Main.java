package Es_2;

public class Main {
    //Scrivere un programma che contenga una classe chiamata Forma ed un metodo chiamato calcolaArea()
    // che stampi l'area della forma. Crea poi una sottoclasse chiamata Rettangolo che fa override
    // del metodo calcolaArea() per calcolare l'area del rettangolo.
    public static void main(String[] args){
        Forma forma = new Forma();
        Rettangolo rettangolo = new Rettangolo();

        forma.calcolaArea();
        rettangolo.calcolaArea();
    }
}
